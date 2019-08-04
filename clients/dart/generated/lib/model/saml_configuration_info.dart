part of openapi.api;

class SamlConfigurationInfo {
  /* Persistent Identity (PID) */
  String pid = null;
  /* Title */
  String title = null;
  /* Title */
  String description = null;
  /* needed for configuration binding */
  String bundleLocation = null;
  /* needed for configuraiton binding */
  String serviceLocation = null;
  
  SamlConfigurationProperties properties = null;
  SamlConfigurationInfo();

  @override
  String toString() {
    return 'SamlConfigurationInfo[pid=$pid, title=$title, description=$description, bundleLocation=$bundleLocation, serviceLocation=$serviceLocation, properties=$properties, ]';
  }

  SamlConfigurationInfo.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    pid = json['pid'];
    title = json['title'];
    description = json['description'];
    bundleLocation = json['bundle_location'];
    serviceLocation = json['service_location'];
    properties = new SamlConfigurationProperties.fromJson(json['properties']);
  }

  Map<String, dynamic> toJson() {
    return {
      'pid': pid,
      'title': title,
      'description': description,
      'bundle_location': bundleLocation,
      'service_location': serviceLocation,
      'properties': properties
    };
  }

  static List<SamlConfigurationInfo> listFromJson(List<dynamic> json) {
    return json == null ? new List<SamlConfigurationInfo>() : json.map((value) => new SamlConfigurationInfo.fromJson(value)).toList();
  }

  static Map<String, SamlConfigurationInfo> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, SamlConfigurationInfo>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new SamlConfigurationInfo.fromJson(value));
    }
    return map;
  }
}

