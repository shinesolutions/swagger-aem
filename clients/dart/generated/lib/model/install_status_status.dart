part of openapi.api;

class InstallStatusStatus {
  
  bool finished = null;
  
  int itemCount = null;
  InstallStatusStatus();

  @override
  String toString() {
    return 'InstallStatusStatus[finished=$finished, itemCount=$itemCount, ]';
  }

  InstallStatusStatus.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    finished = json['finished'];
    itemCount = json['itemCount'];
  }

  Map<String, dynamic> toJson() {
    return {
      'finished': finished,
      'itemCount': itemCount
    };
  }

  static List<InstallStatusStatus> listFromJson(List<dynamic> json) {
    return json == null ? new List<InstallStatusStatus>() : json.map((value) => new InstallStatusStatus.fromJson(value)).toList();
  }

  static Map<String, InstallStatusStatus> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, InstallStatusStatus>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new InstallStatusStatus.fromJson(value));
    }
    return map;
  }
}

