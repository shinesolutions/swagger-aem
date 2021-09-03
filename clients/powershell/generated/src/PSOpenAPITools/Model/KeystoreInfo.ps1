#
# Adobe Experience Manager (AEM) API
# Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
# Version: 3.5.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Aliases
No description available.
.PARAMETER Exists
False if truststore don't exist
.OUTPUTS

KeystoreInfo<PSCustomObject>
#>

function Initialize-KeystoreInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Aliases},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Exists}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => KeystoreInfo' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "aliases" = ${Aliases}
            "exists" = ${Exists}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to KeystoreInfo<PSCustomObject>

.DESCRIPTION

Convert from JSON to KeystoreInfo<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

KeystoreInfo<PSCustomObject>
#>
function ConvertFrom-JsonToKeystoreInfo {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => KeystoreInfo' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in KeystoreInfo
        $AllProperties = ("aliases", "exists")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "aliases"))) { #optional property not found
            $Aliases = $null
        } else {
            $Aliases = $JsonParameters.PSobject.Properties["aliases"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "exists"))) { #optional property not found
            $Exists = $null
        } else {
            $Exists = $JsonParameters.PSobject.Properties["exists"].value
        }

        $PSO = [PSCustomObject]@{
            "aliases" = ${Aliases}
            "exists" = ${Exists}
        }

        return $PSO
    }

}
