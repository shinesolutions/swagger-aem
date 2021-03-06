//
// SamlConfigurationPropertyItemsBoolean.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct SamlConfigurationPropertyItemsBoolean: Codable {

    /** property name */
    public var name: String?
    /** True if optional */
    public var _optional: Bool?
    /** True if property is set */
    public var isSet: Bool?
    /** Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password */
    public var type: Int?
    /** Property value */
    public var value: Bool?
    /** Property description */
    public var _description: String?

    public init(name: String?, _optional: Bool?, isSet: Bool?, type: Int?, value: Bool?, _description: String?) {
        self.name = name
        self._optional = _optional
        self.isSet = isSet
        self.type = type
        self.value = value
        self._description = _description
    }

    public enum CodingKeys: String, CodingKey { 
        case name
        case _optional = "optional"
        case isSet = "is_set"
        case type
        case value
        case _description = "description"
    }


}

