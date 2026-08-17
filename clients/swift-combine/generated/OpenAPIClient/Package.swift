// swift-tools-version:5.1

import PackageDescription

let package = Package(
    name: "OpenAPIClient",
    platforms: [
        .iOS(.v13),
        .macOS(.v10_15)
    ],
    products: [
        .library(
            name: "OpenAPIClient",
            targets: ["OpenAPIClient"]
        ),
    ],
    dependencies: [.package(path: "../OpenAPITransport")],
    targets: [
        .target(
            name: "OpenAPIClient",
            dependencies: [.byName(name: "OpenAPITransport")],
            path: "Sources"
        ),
    ]
)
