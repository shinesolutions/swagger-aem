function Invoke-CqApiGetLoginPage {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: CqApi-GetLoginPage' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CqApi.GetLoginPage(
        )
    }
}

function Invoke-CqApiPostCqActions {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorizableId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${changelog}
    )

    Process {
        'Calling method: CqApi-PostCqActions' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CqApi.PostCqActions(
            ${authorizableId},
            ${changelog}
        )
    }
}

