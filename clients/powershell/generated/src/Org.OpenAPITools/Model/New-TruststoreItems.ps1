function New-TruststoreItems {
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
        ${subject},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${issuer},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notBefore},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notAfter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${serialNumber}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TruststoreItems' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TruststoreItems -ArgumentList @(
            ${alias},
            ${entryType},
            ${subject},
            ${issuer},
            ${notBefore},
            ${notAfter},
            ${serialNumber}
        )
    }
}
