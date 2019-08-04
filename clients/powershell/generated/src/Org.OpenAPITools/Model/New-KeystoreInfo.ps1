function New-KeystoreInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.KeystoreItems[]]]
        ${aliases},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${exists}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.KeystoreInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.KeystoreInfo -ArgumentList @(
            ${aliases},
            ${exists}
        )
    }
}
