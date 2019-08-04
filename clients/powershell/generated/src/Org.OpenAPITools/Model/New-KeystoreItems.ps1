function New-KeystoreItems {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${alias},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${entryType},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${algorithm},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${format},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.KeystoreChainItems[]]]
        ${chain}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.KeystoreItems' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.KeystoreItems -ArgumentList @(
            ${alias},
            ${entryType},
            ${algorithm},
            ${format},
            ${chain}
        )
    }
}
