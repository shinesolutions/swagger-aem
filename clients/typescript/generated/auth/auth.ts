import { RequestContext } from "../http/http";

/**
 * Interface authentication schemes.
 */
export interface SecurityAuthentication {
    /*
     * @return returns the name of the security authentication as specified in OAI
     */
    getName(): string;

    /**
     * Applies the authentication scheme to the request context
     *
     * @params context the request context which should use this authentication scheme
     */
    applySecurityAuthentication(context: RequestContext): void | Promise<void>;
}

export interface TokenProvider {
  getToken(): Promise<string> | string;
}

/**
 * Applies http authentication to the request context.
 */
export class AemAuthAuthentication implements SecurityAuthentication {
    /**
     * Configures the http authentication with the required details.
     *
     * @param username username for http basic authentication
     * @param password password for http basic authentication
     */
    public constructor(
        private username: string,
        private password: string
    ) {}

    public getName(): string {
        return "aemAuth";
    }

    public applySecurityAuthentication(context: RequestContext) {
        let comb = Buffer.from(this.username + ":" + this.password, 'binary').toString('base64');
        context.setHeaderParam("Authorization", "Basic " + comb);
    }
}

export type AuthMethods = {
    "default"?: SecurityAuthentication,
    "aemAuth"?: SecurityAuthentication
}

export type ApiKeyConfiguration = string;
export type HttpBasicConfiguration = { "username": string, "password": string };
export type HttpBearerConfiguration = { tokenProvider: TokenProvider };
export type OAuth2Configuration = { accessToken: string };
export type HttpSignatureConfiguration = unknown; // TODO: Implement

export type AuthMethodsConfiguration = {
    "default"?: SecurityAuthentication,
    "aemAuth"?: HttpBasicConfiguration
}

/**
 * Creates the authentication methods from a swagger description.
 *
 */
export function configureAuthMethods(config: AuthMethodsConfiguration | undefined): AuthMethods {
    let authMethods: AuthMethods = {}

    if (!config) {
        return authMethods;
    }
    authMethods["default"] = config["default"]

    if (config["aemAuth"]) {
        authMethods["aemAuth"] = new AemAuthAuthentication(
            config["aemAuth"]["username"],
            config["aemAuth"]["password"]
        );
    }

    return authMethods;
}