function Invoke-SlingApiDeleteAgent {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${runmode},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name}
    )

    Process {
        'Calling method: SlingApi-DeleteAgent' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.DeleteAgent(
            ${runmode},
            ${name}
        )
    }
}

function Invoke-SlingApiDeleteNode {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name}
    )

    Process {
        'Calling method: SlingApi-DeleteNode' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.DeleteNode(
            ${path},
            ${name}
        )
    }
}

function Invoke-SlingApiGetAgent {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${runmode},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name}
    )

    Process {
        'Calling method: SlingApi-GetAgent' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.GetAgent(
            ${runmode},
            ${name}
        )
    }
}

function Invoke-SlingApiGetAgents {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${runmode}
    )

    Process {
        'Calling method: SlingApi-GetAgents' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.GetAgents(
            ${runmode}
        )
    }
}

function Invoke-SlingApiGetAuthorizableKeystore {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${intermediatePath},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorizableId}
    )

    Process {
        'Calling method: SlingApi-GetAuthorizableKeystore' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.GetAuthorizableKeystore(
            ${intermediatePath},
            ${authorizableId}
        )
    }
}

function Invoke-SlingApiGetKeystore {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${intermediatePath},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorizableId}
    )

    Process {
        'Calling method: SlingApi-GetKeystore' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.GetKeystore(
            ${intermediatePath},
            ${authorizableId}
        )
    }
}

function Invoke-SlingApiGetNode {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name}
    )

    Process {
        'Calling method: SlingApi-GetNode' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.GetNode(
            ${path},
            ${name}
        )
    }
}

function Invoke-SlingApiGetPackage {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${group},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${version}
    )

    Process {
        'Calling method: SlingApi-GetPackage' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.GetPackage(
            ${group},
            ${name},
            ${version}
        )
    }
}

function Invoke-SlingApiGetPackageFilter {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${group},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${version}
    )

    Process {
        'Calling method: SlingApi-GetPackageFilter' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.GetPackageFilter(
            ${group},
            ${name},
            ${version}
        )
    }
}

function Invoke-SlingApiGetQuery {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Decimal]
        ${pPeriodlimit},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${1Property},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${1PropertyPeriodvalue}
    )

    Process {
        'Calling method: SlingApi-GetQuery' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.GetQuery(
            ${path},
            ${pPeriodlimit},
            ${1Property},
            ${1PropertyPeriodvalue}
        )
    }
}

function Invoke-SlingApiGetTruststore {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: SlingApi-GetTruststore' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.GetTruststore(
        )
    }
}

function Invoke-SlingApiGetTruststoreInfo {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: SlingApi-GetTruststoreInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.GetTruststoreInfo(
        )
    }
}

function Invoke-SlingApiPostAgent {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${runmode},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashcqDistribute},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashcqDistributeAtTypeHint},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashcqName},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashcqTemplate},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashenabled},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashjcrDescription},
        [Parameter(Position = 8, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashjcrLastModified},
        [Parameter(Position = 9, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashjcrLastModifiedBy},
        [Parameter(Position = 10, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashjcrMixinTypes},
        [Parameter(Position = 11, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashjcrTitle},
        [Parameter(Position = 12, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashlogLevel},
        [Parameter(Position = 13, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashnoStatusUpdate},
        [Parameter(Position = 14, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashnoVersioning},
        [Parameter(Position = 15, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Decimal]
        ${jcrContentSlashprotocolConnectTimeout},
        [Parameter(Position = 16, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashprotocolHTTPConnectionClosed},
        [Parameter(Position = 17, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashprotocolHTTPExpired},
        [Parameter(Position = 18, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${jcrContentSlashprotocolHTTPHeaders},
        [Parameter(Position = 19, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashprotocolHTTPHeadersAtTypeHint},
        [Parameter(Position = 20, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashprotocolHTTPMethod},
        [Parameter(Position = 21, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashprotocolHTTPSRelaxed},
        [Parameter(Position = 22, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashprotocolInterface},
        [Parameter(Position = 23, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Decimal]
        ${jcrContentSlashprotocolSocketTimeout},
        [Parameter(Position = 24, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashprotocolVersion},
        [Parameter(Position = 25, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashproxyNTLMDomain},
        [Parameter(Position = 26, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashproxyNTLMHost},
        [Parameter(Position = 27, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashproxyHost},
        [Parameter(Position = 28, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashproxyPassword},
        [Parameter(Position = 29, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Decimal]
        ${jcrContentSlashproxyPort},
        [Parameter(Position = 30, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashproxyUser},
        [Parameter(Position = 31, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Decimal]
        ${jcrContentSlashqueueBatchMaxSize},
        [Parameter(Position = 32, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashqueueBatchMode},
        [Parameter(Position = 33, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Decimal]
        ${jcrContentSlashqueueBatchWaitTime},
        [Parameter(Position = 34, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashretryDelay},
        [Parameter(Position = 35, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashreverseReplication},
        [Parameter(Position = 36, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashserializationType},
        [Parameter(Position = 37, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashslingResourceType},
        [Parameter(Position = 38, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashssl},
        [Parameter(Position = 39, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashtransportNTLMDomain},
        [Parameter(Position = 40, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashtransportNTLMHost},
        [Parameter(Position = 41, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashtransportPassword},
        [Parameter(Position = 42, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashtransportUri},
        [Parameter(Position = 43, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashtransportUser},
        [Parameter(Position = 44, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashtriggerDistribute},
        [Parameter(Position = 45, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashtriggerModified},
        [Parameter(Position = 46, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashtriggerOnOffTime},
        [Parameter(Position = 47, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashtriggerReceive},
        [Parameter(Position = 48, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${jcrContentSlashtriggerSpecific},
        [Parameter(Position = 49, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrContentSlashuserId},
        [Parameter(Position = 50, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jcrPrimaryType},
        [Parameter(Position = 51, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${operation}
    )

    Process {
        'Calling method: SlingApi-PostAgent' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostAgent(
            ${runmode},
            ${name},
            ${jcrContentSlashcqDistribute},
            ${jcrContentSlashcqDistributeAtTypeHint},
            ${jcrContentSlashcqName},
            ${jcrContentSlashcqTemplate},
            ${jcrContentSlashenabled},
            ${jcrContentSlashjcrDescription},
            ${jcrContentSlashjcrLastModified},
            ${jcrContentSlashjcrLastModifiedBy},
            ${jcrContentSlashjcrMixinTypes},
            ${jcrContentSlashjcrTitle},
            ${jcrContentSlashlogLevel},
            ${jcrContentSlashnoStatusUpdate},
            ${jcrContentSlashnoVersioning},
            ${jcrContentSlashprotocolConnectTimeout},
            ${jcrContentSlashprotocolHTTPConnectionClosed},
            ${jcrContentSlashprotocolHTTPExpired},
            ${jcrContentSlashprotocolHTTPHeaders},
            ${jcrContentSlashprotocolHTTPHeadersAtTypeHint},
            ${jcrContentSlashprotocolHTTPMethod},
            ${jcrContentSlashprotocolHTTPSRelaxed},
            ${jcrContentSlashprotocolInterface},
            ${jcrContentSlashprotocolSocketTimeout},
            ${jcrContentSlashprotocolVersion},
            ${jcrContentSlashproxyNTLMDomain},
            ${jcrContentSlashproxyNTLMHost},
            ${jcrContentSlashproxyHost},
            ${jcrContentSlashproxyPassword},
            ${jcrContentSlashproxyPort},
            ${jcrContentSlashproxyUser},
            ${jcrContentSlashqueueBatchMaxSize},
            ${jcrContentSlashqueueBatchMode},
            ${jcrContentSlashqueueBatchWaitTime},
            ${jcrContentSlashretryDelay},
            ${jcrContentSlashreverseReplication},
            ${jcrContentSlashserializationType},
            ${jcrContentSlashslingResourceType},
            ${jcrContentSlashssl},
            ${jcrContentSlashtransportNTLMDomain},
            ${jcrContentSlashtransportNTLMHost},
            ${jcrContentSlashtransportPassword},
            ${jcrContentSlashtransportUri},
            ${jcrContentSlashtransportUser},
            ${jcrContentSlashtriggerDistribute},
            ${jcrContentSlashtriggerModified},
            ${jcrContentSlashtriggerOnOffTime},
            ${jcrContentSlashtriggerReceive},
            ${jcrContentSlashtriggerSpecific},
            ${jcrContentSlashuserId},
            ${jcrPrimaryType},
            ${operation}
        )
    }
}

function Invoke-SlingApiPostAuthorizableKeystore {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${intermediatePath},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorizableId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${operation},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${currentPassword},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${newPassword},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${rePassword},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${keyPassword},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${keyStorePass},
        [Parameter(Position = 8, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${alias},
        [Parameter(Position = 9, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${newAlias},
        [Parameter(Position = 10, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${removeAlias},
        [Parameter(Position = 11, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${certChain},
        [Parameter(Position = 12, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${pk},
        [Parameter(Position = 13, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${keyStore}
    )

    Process {
        'Calling method: SlingApi-PostAuthorizableKeystore' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostAuthorizableKeystore(
            ${intermediatePath},
            ${authorizableId},
            ${operation},
            ${currentPassword},
            ${newPassword},
            ${rePassword},
            ${keyPassword},
            ${keyStorePass},
            ${alias},
            ${newAlias},
            ${removeAlias},
            ${certChain},
            ${pk},
            ${keyStore}
        )
    }
}

function Invoke-SlingApiPostAuthorizables {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorizableId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${intermediatePath},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${createUser},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${createGroup},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${repPassword},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${profileSlashgivenName}
    )

    Process {
        'Calling method: SlingApi-PostAuthorizables' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostAuthorizables(
            ${authorizableId},
            ${intermediatePath},
            ${createUser},
            ${createGroup},
            ${repPassword},
            ${profileSlashgivenName}
        )
    }
}

function Invoke-SlingApiPostConfigAdobeGraniteSamlAuthenticationHandler {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${keyStorePassword},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${keyStorePasswordAtTypeHint},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int32]
        ${servicePeriodranking},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${servicePeriodrankingAtTypeHint},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${idpHttpRedirect},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${idpHttpRedirectAtTypeHint},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${createUser},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${createUserAtTypeHint},
        [Parameter(Position = 8, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${defaultRedirectUrl},
        [Parameter(Position = 9, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${defaultRedirectUrlAtTypeHint},
        [Parameter(Position = 10, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${userIDAttribute},
        [Parameter(Position = 11, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${userIDAttributeAtTypeHint},
        [Parameter(Position = 12, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${defaultGroups},
        [Parameter(Position = 13, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${defaultGroupsAtTypeHint},
        [Parameter(Position = 14, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${idpCertAlias},
        [Parameter(Position = 15, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${idpCertAliasAtTypeHint},
        [Parameter(Position = 16, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${addGroupMemberships},
        [Parameter(Position = 17, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${addGroupMembershipsAtTypeHint},
        [Parameter(Position = 18, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${path},
        [Parameter(Position = 19, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${pathAtTypeHint},
        [Parameter(Position = 20, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${synchronizeAttributes},
        [Parameter(Position = 21, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${synchronizeAttributesAtTypeHint},
        [Parameter(Position = 22, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int32]
        ${clockTolerance},
        [Parameter(Position = 23, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${clockToleranceAtTypeHint},
        [Parameter(Position = 24, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${groupMembershipAttribute},
        [Parameter(Position = 25, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${groupMembershipAttributeAtTypeHint},
        [Parameter(Position = 26, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${idpUrl},
        [Parameter(Position = 27, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${idpUrlAtTypeHint},
        [Parameter(Position = 28, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${logoutUrl},
        [Parameter(Position = 29, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${logoutUrlAtTypeHint},
        [Parameter(Position = 30, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${serviceProviderEntityId},
        [Parameter(Position = 31, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${serviceProviderEntityIdAtTypeHint},
        [Parameter(Position = 32, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${assertionConsumerServiceURL},
        [Parameter(Position = 33, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${assertionConsumerServiceURLAtTypeHint},
        [Parameter(Position = 34, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${handleLogout},
        [Parameter(Position = 35, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${handleLogoutAtTypeHint},
        [Parameter(Position = 36, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${spPrivateKeyAlias},
        [Parameter(Position = 37, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${spPrivateKeyAliasAtTypeHint},
        [Parameter(Position = 38, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${useEncryption},
        [Parameter(Position = 39, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${useEncryptionAtTypeHint},
        [Parameter(Position = 40, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${nameIdFormat},
        [Parameter(Position = 41, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${nameIdFormatAtTypeHint},
        [Parameter(Position = 42, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${digestMethod},
        [Parameter(Position = 43, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${digestMethodAtTypeHint},
        [Parameter(Position = 44, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${signatureMethod},
        [Parameter(Position = 45, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${signatureMethodAtTypeHint},
        [Parameter(Position = 46, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${userIntermediatePath},
        [Parameter(Position = 47, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${userIntermediatePathAtTypeHint}
    )

    Process {
        'Calling method: SlingApi-PostConfigAdobeGraniteSamlAuthenticationHandler' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostConfigAdobeGraniteSamlAuthenticationHandler(
            ${keyStorePassword},
            ${keyStorePasswordAtTypeHint},
            ${servicePeriodranking},
            ${servicePeriodrankingAtTypeHint},
            ${idpHttpRedirect},
            ${idpHttpRedirectAtTypeHint},
            ${createUser},
            ${createUserAtTypeHint},
            ${defaultRedirectUrl},
            ${defaultRedirectUrlAtTypeHint},
            ${userIDAttribute},
            ${userIDAttributeAtTypeHint},
            ${defaultGroups},
            ${defaultGroupsAtTypeHint},
            ${idpCertAlias},
            ${idpCertAliasAtTypeHint},
            ${addGroupMemberships},
            ${addGroupMembershipsAtTypeHint},
            ${path},
            ${pathAtTypeHint},
            ${synchronizeAttributes},
            ${synchronizeAttributesAtTypeHint},
            ${clockTolerance},
            ${clockToleranceAtTypeHint},
            ${groupMembershipAttribute},
            ${groupMembershipAttributeAtTypeHint},
            ${idpUrl},
            ${idpUrlAtTypeHint},
            ${logoutUrl},
            ${logoutUrlAtTypeHint},
            ${serviceProviderEntityId},
            ${serviceProviderEntityIdAtTypeHint},
            ${assertionConsumerServiceURL},
            ${assertionConsumerServiceURLAtTypeHint},
            ${handleLogout},
            ${handleLogoutAtTypeHint},
            ${spPrivateKeyAlias},
            ${spPrivateKeyAliasAtTypeHint},
            ${useEncryption},
            ${useEncryptionAtTypeHint},
            ${nameIdFormat},
            ${nameIdFormatAtTypeHint},
            ${digestMethod},
            ${digestMethodAtTypeHint},
            ${signatureMethod},
            ${signatureMethodAtTypeHint},
            ${userIntermediatePath},
            ${userIntermediatePathAtTypeHint}
        )
    }
}

function Invoke-SlingApiPostConfigApacheFelixJettyBasedHttpService {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodnio},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint},
        [Parameter(Position = 8, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword},
        [Parameter(Position = 9, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint},
        [Parameter(Position = 10, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore},
        [Parameter(Position = 11, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint},
        [Parameter(Position = 12, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword},
        [Parameter(Position = 13, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint},
        [Parameter(Position = 14, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate},
        [Parameter(Position = 15, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint},
        [Parameter(Position = 16, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodenable},
        [Parameter(Position = 17, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint},
        [Parameter(Position = 18, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure},
        [Parameter(Position = 19, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint}
    )

    Process {
        'Calling method: SlingApi-PostConfigApacheFelixJettyBasedHttpService' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostConfigApacheFelixJettyBasedHttpService(
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodnio},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodenable},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint},
            ${orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure},
            ${orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint}
        )
    }
}

function Invoke-SlingApiPostConfigApacheHttpComponentsProxyConfiguration {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${proxyPeriodhost},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${proxyPeriodhostAtTypeHint},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int32]
        ${proxyPeriodport},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${proxyPeriodportAtTypeHint},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${proxyPeriodexceptions},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${proxyPeriodexceptionsAtTypeHint},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${proxyPeriodenabled},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${proxyPeriodenabledAtTypeHint},
        [Parameter(Position = 8, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${proxyPerioduser},
        [Parameter(Position = 9, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${proxyPerioduserAtTypeHint},
        [Parameter(Position = 10, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${proxyPeriodpassword},
        [Parameter(Position = 11, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${proxyPeriodpasswordAtTypeHint}
    )

    Process {
        'Calling method: SlingApi-PostConfigApacheHttpComponentsProxyConfiguration' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostConfigApacheHttpComponentsProxyConfiguration(
            ${proxyPeriodhost},
            ${proxyPeriodhostAtTypeHint},
            ${proxyPeriodport},
            ${proxyPeriodportAtTypeHint},
            ${proxyPeriodexceptions},
            ${proxyPeriodexceptionsAtTypeHint},
            ${proxyPeriodenabled},
            ${proxyPeriodenabledAtTypeHint},
            ${proxyPerioduser},
            ${proxyPerioduserAtTypeHint},
            ${proxyPeriodpassword},
            ${proxyPeriodpasswordAtTypeHint}
        )
    }
}

function Invoke-SlingApiPostConfigApacheSlingDavExServlet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${alias},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${aliasAtTypeHint},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${davPeriodcreateAbsoluteUri},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${davPeriodcreateAbsoluteUriAtTypeHint}
    )

    Process {
        'Calling method: SlingApi-PostConfigApacheSlingDavExServlet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostConfigApacheSlingDavExServlet(
            ${alias},
            ${aliasAtTypeHint},
            ${davPeriodcreateAbsoluteUri},
            ${davPeriodcreateAbsoluteUriAtTypeHint}
        )
    }
}

function Invoke-SlingApiPostConfigApacheSlingGetServlet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jsonPeriodmaximumresults},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${jsonPeriodmaximumresultsAtTypeHint},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${enablePeriodhtml},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${enablePeriodhtmlAtTypeHint},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${enablePeriodtxt},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${enablePeriodtxtAtTypeHint},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${enablePeriodxml},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${enablePeriodxmlAtTypeHint}
    )

    Process {
        'Calling method: SlingApi-PostConfigApacheSlingGetServlet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostConfigApacheSlingGetServlet(
            ${jsonPeriodmaximumresults},
            ${jsonPeriodmaximumresultsAtTypeHint},
            ${enablePeriodhtml},
            ${enablePeriodhtmlAtTypeHint},
            ${enablePeriodtxt},
            ${enablePeriodtxtAtTypeHint},
            ${enablePeriodxml},
            ${enablePeriodxmlAtTypeHint}
        )
    }
}

function Invoke-SlingApiPostConfigApacheSlingReferrerFilter {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${allowPeriodempty},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${allowPeriodemptyAtTypeHint},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${allowPeriodhosts},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${allowPeriodhostsAtTypeHint},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${allowPeriodhostsPeriodregexp},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${allowPeriodhostsPeriodregexpAtTypeHint},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${filterPeriodmethods},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${filterPeriodmethodsAtTypeHint}
    )

    Process {
        'Calling method: SlingApi-PostConfigApacheSlingReferrerFilter' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostConfigApacheSlingReferrerFilter(
            ${allowPeriodempty},
            ${allowPeriodemptyAtTypeHint},
            ${allowPeriodhosts},
            ${allowPeriodhostsAtTypeHint},
            ${allowPeriodhostsPeriodregexp},
            ${allowPeriodhostsPeriodregexpAtTypeHint},
            ${filterPeriodmethods},
            ${filterPeriodmethodsAtTypeHint}
        )
    }
}

function Invoke-SlingApiPostNode {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${operation},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${deleteAuthorizable},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${file}
    )

    Process {
        'Calling method: SlingApi-PostNode' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostNode(
            ${path},
            ${name},
            ${operation},
            ${deleteAuthorizable},
            ${file}
        )
    }
}

function Invoke-SlingApiPostNodeRw {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${addMembers}
    )

    Process {
        'Calling method: SlingApi-PostNodeRw' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostNodeRw(
            ${path},
            ${name},
            ${addMembers}
        )
    }
}

function Invoke-SlingApiPostPath {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${jcrPrimaryType},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name}
    )

    Process {
        'Calling method: SlingApi-PostPath' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostPath(
            ${path},
            ${jcrPrimaryType},
            ${name}
        )
    }
}

function Invoke-SlingApiPostQuery {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Decimal]
        ${pPeriodlimit},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${1Property},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${1PropertyPeriodvalue}
    )

    Process {
        'Calling method: SlingApi-PostQuery' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostQuery(
            ${path},
            ${pPeriodlimit},
            ${1Property},
            ${1PropertyPeriodvalue}
        )
    }
}

function Invoke-SlingApiPostTreeActivation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean]
        ${ignoredeactivated},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean]
        ${onlymodified},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path}
    )

    Process {
        'Calling method: SlingApi-PostTreeActivation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostTreeActivation(
            ${ignoredeactivated},
            ${onlymodified},
            ${path}
        )
    }
}

function Invoke-SlingApiPostTruststore {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${operation},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${newPassword},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${rePassword},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${keyStoreType},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${removeAlias},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${certificate}
    )

    Process {
        'Calling method: SlingApi-PostTruststore' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostTruststore(
            ${operation},
            ${newPassword},
            ${rePassword},
            ${keyStoreType},
            ${removeAlias},
            ${certificate}
        )
    }
}

function Invoke-SlingApiPostTruststorePKCS12 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${truststorePeriodp12}
    )

    Process {
        'Calling method: SlingApi-PostTruststorePKCS12' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SlingApi.PostTruststorePKCS12(
            ${truststorePeriodp12}
        )
    }
}

