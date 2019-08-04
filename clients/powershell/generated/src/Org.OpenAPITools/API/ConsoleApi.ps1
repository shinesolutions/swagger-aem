function Invoke-ConsoleApiGetAemProductInfo {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: ConsoleApi-GetAemProductInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConsoleApi.GetAemProductInfo(
        )
    }
}

function Invoke-ConsoleApiGetConfigMgr {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: ConsoleApi-GetConfigMgr' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConsoleApi.GetConfigMgr(
        )
    }
}

function Invoke-ConsoleApiPostBundle {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${action}
    )

    Process {
        'Calling method: ConsoleApi-PostBundle' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConsoleApi.PostBundle(
            ${name},
            ${action}
        )
    }
}

function Invoke-ConsoleApiPostJmxRepository {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${action}
    )

    Process {
        'Calling method: ConsoleApi-PostJmxRepository' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConsoleApi.PostJmxRepository(
            ${action}
        )
    }
}

function Invoke-ConsoleApiPostSamlConfiguration {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${post},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${apply},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${delete},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${action},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Dollarlocation},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${path},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int32]
        ${servicePeriodranking},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${idpUrl},
        [Parameter(Position = 8, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${idpCertAlias},
        [Parameter(Position = 9, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${idpHttpRedirect},
        [Parameter(Position = 10, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${serviceProviderEntityId},
        [Parameter(Position = 11, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${assertionConsumerServiceURL},
        [Parameter(Position = 12, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${spPrivateKeyAlias},
        [Parameter(Position = 13, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${keyStorePassword},
        [Parameter(Position = 14, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${defaultRedirectUrl},
        [Parameter(Position = 15, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${userIDAttribute},
        [Parameter(Position = 16, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${useEncryption},
        [Parameter(Position = 17, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${createUser},
        [Parameter(Position = 18, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${addGroupMemberships},
        [Parameter(Position = 19, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${groupMembershipAttribute},
        [Parameter(Position = 20, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${defaultGroups},
        [Parameter(Position = 21, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${nameIdFormat},
        [Parameter(Position = 22, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${synchronizeAttributes},
        [Parameter(Position = 23, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${handleLogout},
        [Parameter(Position = 24, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${logoutUrl},
        [Parameter(Position = 25, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int32]
        ${clockTolerance},
        [Parameter(Position = 26, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${digestMethod},
        [Parameter(Position = 27, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${signatureMethod},
        [Parameter(Position = 28, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${userIntermediatePath},
        [Parameter(Position = 29, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${propertylist}
    )

    Process {
        'Calling method: ConsoleApi-PostSamlConfiguration' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConsoleApi.PostSamlConfiguration(
            ${post},
            ${apply},
            ${delete},
            ${action},
            ${Dollarlocation},
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
            ${userIntermediatePath},
            ${propertylist}
        )
    }
}

