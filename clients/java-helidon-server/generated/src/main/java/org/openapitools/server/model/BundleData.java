package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BundleDataProp;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BundleData   {

    private Integer id;
    private String name;
    private Boolean fragment;
    private Integer stateRaw;
    private String state;
    private String version;
    private String symbolicName;
    private String category;
    private List<@Valid BundleDataProp> props = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BundleData() {
    // JSON-B / Jackson
    }

    /**
     * Create BundleData.
     *
     * @param id Bundle ID
     * @param name Bundle name
     * @param fragment Is bundle a fragment
     * @param stateRaw Numeric raw bundle state value
     * @param state Bundle state value
     * @param version Bundle version
     * @param symbolicName Bundle symbolic name
     * @param category Bundle category
     * @param props props
     */
    public BundleData(
        Integer id, 
        String name, 
        Boolean fragment, 
        Integer stateRaw, 
        String state, 
        String version, 
        String symbolicName, 
        String category, 
        List<@Valid BundleDataProp> props
    ) {
        this.id = id;
        this.name = name;
        this.fragment = fragment;
        this.stateRaw = stateRaw;
        this.state = state;
        this.version = version;
        this.symbolicName = symbolicName;
        this.category = category;
        this.props = props;
    }



    /**
     * Bundle ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Bundle name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Is bundle a fragment
     * @return fragment
     */
    public Boolean getFragment() {
        return fragment;
    }

    public void setFragment(Boolean fragment) {
        this.fragment = fragment;
    }

    /**
     * Numeric raw bundle state value
     * @return stateRaw
     */
    public Integer getStateRaw() {
        return stateRaw;
    }

    public void setStateRaw(Integer stateRaw) {
        this.stateRaw = stateRaw;
    }

    /**
     * Bundle state value
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * Bundle version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Bundle symbolic name
     * @return symbolicName
     */
    public String getSymbolicName() {
        return symbolicName;
    }

    public void setSymbolicName(String symbolicName) {
        this.symbolicName = symbolicName;
    }

    /**
     * Bundle category
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Get props
     * @return props
     */
    public List<@Valid BundleDataProp> getProps() {
        return props;
    }

    public void setProps(List<@Valid BundleDataProp> props) {
        this.props = props;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BundleData {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
        sb.append("    stateRaw: ").append(toIndentedString(stateRaw)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    symbolicName: ").append(toIndentedString(symbolicName)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    props: ").append(toIndentedString(props)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

