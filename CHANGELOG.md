### 1.1.13
* Add postConfigAemHealthCheckServlet operation

### 1.1.12
* Rearrange postAgent parameters in alphabetical order
* Add 22 optional parameters to postAgent operation #22

### 1.1.11
* Rename postConfigAemPasswordReset operation's property to pwdreset.authorizables

### 1.1.10
* Add jcr:content/protocolHTTPSRelaxed parameter to postAgent operation #19
* Add postConfigAemPasswordReset operation #20
* Add getAemHealthCheck operation #21

### 1.1.9
* Add jcr:content/triggerDistribute, jcr:content/triggerModified, and jcr:content/userId parameters to postAgent operation #18

### 1.1.8
* Add recursive param to postPackageServiceJson operation

### 1.1.7
* Add getAgents operation #16
* Set getLoginPage operation's return type to string #9

### 1.1.6
* Add allow.empty, allow.hosts, and allow.hosts.regexp parameters to postConfig operation
* Add alias and dav.create-absolute-uri parameters to postConfig operation #11
* Split postConfig operation into postConfig<service> operations

### 1.1.5
* Add json.maximumresults, enable.html, enable.txt, enable.xml parameters to postConfig operation
* Fix org.apache.felix.https.enable parameter type to be boolean

### 1.1.4
* Add :operation query parameter to postAgent operation #15

### 1.1.3
* Add jcr:content/reverseReplication query parameter to postAgent operation #12

### 1.1.2
* Add cq getLoginPage operation

### 1.1.1
* Fix missing leading slash on postCqActions

### 1.1
* Add transport user and transport password to /etc/replication/agents.{runmode}/{name} postAgent #1

### 1.0
* Initial version
