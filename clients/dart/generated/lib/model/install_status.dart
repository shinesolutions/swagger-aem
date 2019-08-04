part of openapi.api;

class InstallStatus {
  
  InstallStatusStatus status = null;
  InstallStatus();

  @override
  String toString() {
    return 'InstallStatus[status=$status, ]';
  }

  InstallStatus.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    status = new InstallStatusStatus.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'status': status
    };
  }

  static List<InstallStatus> listFromJson(List<dynamic> json) {
    return json == null ? new List<InstallStatus>() : json.map((value) => new InstallStatus.fromJson(value)).toList();
  }

  static Map<String, InstallStatus> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, InstallStatus>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new InstallStatus.fromJson(value));
    }
    return map;
  }
}

