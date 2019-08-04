function New-SamlConfigurationProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsArray]]
        ${path},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsLong]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${idpUrl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${idpCertAlias},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsBoolean]]
        ${idpHttpRedirect},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${serviceProviderEntityId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${assertionConsumerServiceURL},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${spPrivateKeyAlias},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${keyStorePassword},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${defaultRedirectUrl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${userIDAttribute},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsBoolean]]
        ${useEncryption},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsBoolean]]
        ${createUser},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsBoolean]]
        ${addGroupMemberships},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${groupMembershipAttribute},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsArray]]
        ${defaultGroups},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${nameIdFormat},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsArray]]
        ${synchronizeAttributes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsBoolean]]
        ${handleLogout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${logoutUrl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsLong]]
        ${clockTolerance},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${digestMethod},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${signatureMethod},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SamlConfigurationPropertyItemsString]]
        ${userIntermediatePath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.SamlConfigurationProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.SamlConfigurationProperties -ArgumentList @(
            ${path},
            ${servicePeriodranking},
            ${idpUrl},
            ${idpCertAlias},
            ${idpHttpRedirect},
            ${serviceProviderEntityId},
            ${assertionConsumerServiceURL},
            ${spPrivateKeyAlias},
            ${keyStorePassword},
            ${defaultRedirectUrl},
            ${userIDAttribute},
            ${useEncryption},
            ${createUser},
            ${addGroupMemberships},
            ${groupMembershipAttribute},
            ${defaultGroups},
            ${nameIdFormat},
            ${synchronizeAttributes},
            ${handleLogout},
            ${logoutUrl},
            ${clockTolerance},
            ${digestMethod},
            ${signatureMethod},
            ${userIntermediatePath}
        )
    }
}
