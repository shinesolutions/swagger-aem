function New-InstallStatus {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.InstallStatusStatus]]
        ${status}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InstallStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InstallStatus -ArgumentList @(
            ${status}
        )
    }
}
