//
// InstallStatus.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class InstallStatus: JSONEncodable {
    public var status: InstallStatusStatus?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["status"] = self.status?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}