package main

import (
	"github.com/shinesolutions/swagger-aem/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// GetAemProductInfo - 
	e.GET("/system/console/status-productinfo.json", c.GetAemProductInfo)

	// GetBundleInfo - 
	e.GET("/system/console/bundles/:name.json", c.GetBundleInfo)

	// GetConfigMgr - 
	e.GET("/system/console/configMgr", c.GetConfigMgr)

	// PostBundle - 
	e.POST("/system/console/bundles/:name", c.PostBundle)

	// PostJmxRepository - 
	e.POST("/system/console/jmx/com.adobe.granite:type=Repository/op/:action", c.PostJmxRepository)

	// PostSamlConfiguration - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler", c.PostSamlConfiguration)

	// GetLoginPage - 
	e.GET("/libs/granite/core/content/login.html", c.GetLoginPage)

	// PostCqActions - 
	e.POST("/.cqactions.html", c.PostCqActions)

	// GetCrxdeStatus - 
	e.GET("/crx/server/crx.default/jcr:root/.1.json", c.GetCrxdeStatus)

	// GetInstallStatus - 
	e.GET("/crx/packmgr/installstatus.jsp", c.GetInstallStatus)

	// GetPackageManagerServlet - 
	e.GET("/crx/packmgr/service/script.html", c.GetPackageManagerServlet)

	// PostPackageService - 
	e.POST("/crx/packmgr/service.jsp", c.PostPackageService)

	// PostPackageServiceJson - 
	e.POST("/crx/packmgr/service/.json/:path", c.PostPackageServiceJson)

	// PostPackageUpdate - 
	e.POST("/crx/packmgr/update.jsp", c.PostPackageUpdate)

	// PostSetPassword - 
	e.POST("/crx/explorer/ui/setpassword.jsp", c.PostSetPassword)

	// GetAemHealthCheck - 
	e.GET("/system/health", c.GetAemHealthCheck)

	// PostConfigAemHealthCheckServlet - 
	e.POST("/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck", c.PostConfigAemHealthCheckServlet)

	// PostConfigAemPasswordReset - 
	e.POST("/apps/system/config/com.shinesolutions.aem.passwordreset.Activator", c.PostConfigAemPasswordReset)

	// SslSetup - 
	e.POST("/libs/granite/security/post/sslSetup.html", c.SslSetup)

	// DeleteAgent - 
	e.DELETE("/etc/replication/agents.:runmode/:name", c.DeleteAgent)

	// DeleteNode - 
	e.DELETE("/:path/:name", c.DeleteNode)

	// GetAgent - 
	e.GET("/etc/replication/agents.:runmode/:name", c.GetAgent)

	// GetAgents - 
	e.GET("/etc/replication/agents.:runmode.-1.json", c.GetAgents)

	// GetAuthorizableKeystore - 
	e.GET("/:intermediatePath/:authorizableId.ks.json", c.GetAuthorizableKeystore)

	// GetKeystore - 
	e.GET("/:intermediatePath/:authorizableId/keystore/store.p12", c.GetKeystore)

	// GetNode - 
	e.GET("/:path/:name", c.GetNode)

	// GetPackage - 
	e.GET("/etc/packages/:group/:name-:version.zip", c.GetPackage)

	// GetPackageFilter - 
	e.GET("/etc/packages/:group/:name-:version.zip/jcr:content/vlt:definition/filter.tidy.2.json", c.GetPackageFilter)

	// GetQuery - 
	e.GET("/bin/querybuilder.json", c.GetQuery)

	// GetTruststore - 
	e.GET("/etc/truststore/truststore.p12", c.GetTruststore)

	// GetTruststoreInfo - 
	e.GET("/libs/granite/security/truststore.json", c.GetTruststoreInfo)

	// PostAgent - 
	e.POST("/etc/replication/agents.:runmode/:name", c.PostAgent)

	// PostAuthorizableKeystore - 
	e.POST("/:intermediatePath/:authorizableId.ks.html", c.PostAuthorizableKeystore)

	// PostAuthorizables - 
	e.POST("/libs/granite/security/post/authorizables", c.PostAuthorizables)

	// PostConfigAdobeGraniteSamlAuthenticationHandler - 
	e.POST("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config", c.PostConfigAdobeGraniteSamlAuthenticationHandler)

	// PostConfigApacheFelixJettyBasedHttpService - 
	e.POST("/apps/system/config/org.apache.felix.http", c.PostConfigApacheFelixJettyBasedHttpService)

	// PostConfigApacheHttpComponentsProxyConfiguration - 
	e.POST("/apps/system/config/org.apache.http.proxyconfigurator.config", c.PostConfigApacheHttpComponentsProxyConfiguration)

	// PostConfigApacheSlingDavExServlet - 
	e.POST("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet", c.PostConfigApacheSlingDavExServlet)

	// PostConfigApacheSlingGetServlet - 
	e.POST("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet", c.PostConfigApacheSlingGetServlet)

	// PostConfigApacheSlingReferrerFilter - 
	e.POST("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter", c.PostConfigApacheSlingReferrerFilter)

	// PostConfigProperty - 
	e.POST("/apps/system/config/:configNodeName", c.PostConfigProperty)

	// PostNode - 
	e.POST("/:path/:name", c.PostNode)

	// PostNodeRw - 
	e.POST("/:path/:name.rw.html", c.PostNodeRw)

	// PostPath - 
	e.POST("/:path/", c.PostPath)

	// PostQuery - 
	e.POST("/bin/querybuilder.json", c.PostQuery)

	// PostTreeActivation - 
	e.POST("/libs/replication/treeactivation.html", c.PostTreeActivation)

	// PostTruststore - 
	e.POST("/libs/granite/security/post/truststore", c.PostTruststore)

	// PostTruststorePKCS12 - 
	e.POST("/etc/truststore", c.PostTruststorePKCS12)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
