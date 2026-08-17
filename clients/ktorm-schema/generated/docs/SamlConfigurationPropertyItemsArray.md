
# Table `SamlConfigurationPropertyItemsArray`
(mapped from: SamlConfigurationPropertyItemsArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** | property name |  [optional]
**optional** | optional | boolean |  | **kotlin.Boolean** | True if optional |  [optional]
**isSet** | is_set | boolean |  | **kotlin.Boolean** | True if property is set |  [optional]
**type** | type | int |  | **kotlin.Int** | Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password |  [optional]
**propertyValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Property value |  [optional]
**description** | description | text |  | **kotlin.String** | Property description |  [optional]






# **Table `SamlConfigurationPropertyItemsArrayPropertyValues`**
(mapped from: SamlConfigurationPropertyItemsArrayPropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
samlConfigurationPropertyItemsArray | samlConfigurationPropertyItemsArray | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | text | | kotlin.String | Foreign Key | *many*




