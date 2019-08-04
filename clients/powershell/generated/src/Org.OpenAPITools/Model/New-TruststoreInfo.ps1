function New-TruststoreInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TruststoreItems[]]]
        ${aliases},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${exists}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TruststoreInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TruststoreInfo -ArgumentList @(
            ${aliases},
            ${exists}
        )
    }
}
