namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BundleData 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public bool Fragment { get; set; }
    public int StateRaw { get; set; }
    public string State { get; set; }
    public string VarVersion { get; set; }
    public string SymbolicName { get; set; }
    public string Category { get; set; }
    public List<BundleDataProp> Props { get; set; }
}


