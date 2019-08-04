function Invoke-CrxApiGetCrxdeStatus {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: CrxApi-GetCrxdeStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CrxApi.GetCrxdeStatus(
        )
    }
}

function Invoke-CrxApiGetInstallStatus {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: CrxApi-GetInstallStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CrxApi.GetInstallStatus(
        )
    }
}

function Invoke-CrxApiGetPackageManagerServlet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: CrxApi-GetPackageManagerServlet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CrxApi.GetPackageManagerServlet(
        )
    }
}

function Invoke-CrxApiPostPackageService {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${cmd}
    )

    Process {
        'Calling method: CrxApi-PostPackageService' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CrxApi.PostPackageService(
            ${cmd}
        )
    }
}

function Invoke-CrxApiPostPackageServiceJson {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${cmd},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${groupName},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${packageName},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${packageVersion},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${charset},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${force},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${recursive},
        [Parameter(Position = 8, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${package}
    )

    Process {
        'Calling method: CrxApi-PostPackageServiceJson' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CrxApi.PostPackageServiceJson(
            ${path},
            ${cmd},
            ${groupName},
            ${packageName},
            ${packageVersion},
            ${charset},
            ${force},
            ${recursive},
            ${package}
        )
    }
}

function Invoke-CrxApiPostPackageUpdate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${groupName},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${packageName},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${version},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${filter},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${charset}
    )

    Process {
        'Calling method: CrxApi-PostPackageUpdate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CrxApi.PostPackageUpdate(
            ${groupName},
            ${packageName},
            ${version},
            ${path},
            ${filter},
            ${charset}
        )
    }
}

function Invoke-CrxApiPostSetPassword {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${old},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${plain},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${verify}
    )

    Process {
        'Calling method: CrxApi-PostSetPassword' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CrxApi.PostSetPassword(
            ${old},
            ${plain},
            ${verify}
        )
    }
}

