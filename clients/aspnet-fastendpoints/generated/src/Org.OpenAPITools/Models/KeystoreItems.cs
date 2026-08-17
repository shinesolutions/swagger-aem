namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class KeystoreItems 
{
    public string Alias { get; set; }
    public string EntryType { get; set; }
    public string Algorithm { get; set; }
    public string Format { get; set; }
    public List<KeystoreChainItems> Chain { get; set; }
}


