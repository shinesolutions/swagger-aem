function New-KeystoreChainItems {
    [CmdletBinding()]
    Param (
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
        'Creating object: Org.OpenAPITools.Model.KeystoreChainItems' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.KeystoreChainItems -ArgumentList @(
            ${subject},
            ${issuer},
            ${notBefore},
            ${notAfter},
            ${serialNumber}
        )
    }
}
