function Invoke-CustomApiGetAemHealthCheck {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${tags},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${combineTagsOr}
    )

    Process {
        'Calling method: CustomApi-GetAemHealthCheck' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CustomApi.GetAemHealthCheck(
            ${tags},
            ${combineTagsOr}
        )
    }
}

function Invoke-CustomApiPostConfigAemHealthCheckServlet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${bundlesPeriodignored},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${bundlesPeriodignoredAtTypeHint}
    )

    Process {
        'Calling method: CustomApi-PostConfigAemHealthCheckServlet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CustomApi.PostConfigAemHealthCheckServlet(
            ${bundlesPeriodignored},
            ${bundlesPeriodignoredAtTypeHint}
        )
    }
}

function Invoke-CustomApiPostConfigAemPasswordReset {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${pwdresetPeriodauthorizables},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${pwdresetPeriodauthorizablesAtTypeHint}
    )

    Process {
        'Calling method: CustomApi-PostConfigAemPasswordReset' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CustomApi.PostConfigAemPasswordReset(
            ${pwdresetPeriodauthorizables},
            ${pwdresetPeriodauthorizablesAtTypeHint}
        )
    }
}

