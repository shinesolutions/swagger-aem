function New-InstallStatusStatus {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${finished},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${itemCount}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InstallStatusStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InstallStatusStatus -ArgumentList @(
            ${finished},
            ${itemCount}
        )
    }
}
