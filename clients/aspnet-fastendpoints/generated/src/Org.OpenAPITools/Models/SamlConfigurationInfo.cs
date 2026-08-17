namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class SamlConfigurationInfo 
{
    public string Pid { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public string BundleLocation { get; set; }
    public string ServiceLocation { get; set; }
    public SamlConfigurationProperties Properties { get; set; }
}


