#region Import functions

'API', 'Model', 'Private' | Get-ChildItem -Path {
    Join-Path $PSScriptRoot $_
} -Filter '*.ps1' | ForEach-Object {
    Write-Verbose "Importing file: $($_.BaseName)"
    try {
        . $_.FullName
    } catch {
        Write-Verbose "Can't import function!"
    }
}

#endregion


#region Initialize APIs

'Creating object: Org.OpenAPITools.Api.ConsoleApi' | Write-Verbose
$Script:ConsoleApi= New-Object -TypeName Org.OpenAPITools.Api.ConsoleApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.CqApi' | Write-Verbose
$Script:CqApi= New-Object -TypeName Org.OpenAPITools.Api.CqApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.CrxApi' | Write-Verbose
$Script:CrxApi= New-Object -TypeName Org.OpenAPITools.Api.CrxApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.CustomApi' | Write-Verbose
$Script:CustomApi= New-Object -TypeName Org.OpenAPITools.Api.CustomApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.SlingApi' | Write-Verbose
$Script:SlingApi= New-Object -TypeName Org.OpenAPITools.Api.SlingApi -ArgumentList @($null)


#endregion
