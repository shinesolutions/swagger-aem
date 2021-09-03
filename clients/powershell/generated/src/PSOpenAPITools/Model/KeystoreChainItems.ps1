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

.PARAMETER Subject
e.g. ""CN=localhost""
.PARAMETER Issuer
e.g. ""CN=Admin""
.PARAMETER NotBefore
e.g. ""Sun Jul 01 12:00:00 AEST 2018""
.PARAMETER NotAfter
e.g. ""Sun Jun 30 23:59:50 AEST 2019""
.PARAMETER SerialNumber
18165099476682912368
.OUTPUTS

KeystoreChainItems<PSCustomObject>
#>

function Initialize-KeystoreChainItems {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Subject},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Issuer},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${NotBefore},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${NotAfter},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SerialNumber}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => KeystoreChainItems' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "subject" = ${Subject}
            "issuer" = ${Issuer}
            "notBefore" = ${NotBefore}
            "notAfter" = ${NotAfter}
            "serialNumber" = ${SerialNumber}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to KeystoreChainItems<PSCustomObject>

.DESCRIPTION

Convert from JSON to KeystoreChainItems<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

KeystoreChainItems<PSCustomObject>
#>
function ConvertFrom-JsonToKeystoreChainItems {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => KeystoreChainItems' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in KeystoreChainItems
        $AllProperties = ("subject", "issuer", "notBefore", "notAfter", "serialNumber")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "subject"))) { #optional property not found
            $Subject = $null
        } else {
            $Subject = $JsonParameters.PSobject.Properties["subject"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "issuer"))) { #optional property not found
            $Issuer = $null
        } else {
            $Issuer = $JsonParameters.PSobject.Properties["issuer"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "notBefore"))) { #optional property not found
            $NotBefore = $null
        } else {
            $NotBefore = $JsonParameters.PSobject.Properties["notBefore"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "notAfter"))) { #optional property not found
            $NotAfter = $null
        } else {
            $NotAfter = $JsonParameters.PSobject.Properties["notAfter"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "serialNumber"))) { #optional property not found
            $SerialNumber = $null
        } else {
            $SerialNumber = $JsonParameters.PSobject.Properties["serialNumber"].value
        }

        $PSO = [PSCustomObject]@{
            "subject" = ${Subject}
            "issuer" = ${Issuer}
            "notBefore" = ${NotBefore}
            "notAfter" = ${NotAfter}
            "serialNumber" = ${SerialNumber}
        }

        return $PSO
    }

}
