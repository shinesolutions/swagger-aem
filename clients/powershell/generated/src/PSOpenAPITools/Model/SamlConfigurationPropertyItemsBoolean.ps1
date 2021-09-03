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

.PARAMETER Name
property name
.PARAMETER Optional
True if optional
.PARAMETER IsSet
True if property is set
.PARAMETER Type
Property type, 1=String, 3=long, 11=boolean, 12=Password
.PARAMETER Value
Property value
.PARAMETER Description
Property description
.OUTPUTS

SamlConfigurationPropertyItemsBoolean<PSCustomObject>
#>

function Initialize-SamlConfigurationPropertyItemsBoolean {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Optional},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${IsSet},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Type},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Value},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Description}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => SamlConfigurationPropertyItemsBoolean' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "name" = ${Name}
            "optional" = ${Optional}
            "is_set" = ${IsSet}
            "type" = ${Type}
            "value" = ${Value}
            "description" = ${Description}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to SamlConfigurationPropertyItemsBoolean<PSCustomObject>

.DESCRIPTION

Convert from JSON to SamlConfigurationPropertyItemsBoolean<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

SamlConfigurationPropertyItemsBoolean<PSCustomObject>
#>
function ConvertFrom-JsonToSamlConfigurationPropertyItemsBoolean {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => SamlConfigurationPropertyItemsBoolean' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in SamlConfigurationPropertyItemsBoolean
        $AllProperties = ("name", "optional", "is_set", "type", "value", "description")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "optional"))) { #optional property not found
            $Optional = $null
        } else {
            $Optional = $JsonParameters.PSobject.Properties["optional"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_set"))) { #optional property not found
            $IsSet = $null
        } else {
            $IsSet = $JsonParameters.PSobject.Properties["is_set"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) { #optional property not found
            $Type = $null
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "value"))) { #optional property not found
            $Value = $null
        } else {
            $Value = $JsonParameters.PSobject.Properties["value"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "description"))) { #optional property not found
            $Description = $null
        } else {
            $Description = $JsonParameters.PSobject.Properties["description"].value
        }

        $PSO = [PSCustomObject]@{
            "name" = ${Name}
            "optional" = ${Optional}
            "is_set" = ${IsSet}
            "type" = ${Type}
            "value" = ${Value}
            "description" = ${Description}
        }

        return $PSO
    }

}
