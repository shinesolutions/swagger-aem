namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class SamlConfigurationProperties 
{
    public SamlConfigurationPropertyItemsArray Path { get; set; }
    public SamlConfigurationPropertyItemsLong ServiceRanking { get; set; }
    public SamlConfigurationPropertyItemsString IdpUrl { get; set; }
    public SamlConfigurationPropertyItemsString IdpCertAlias { get; set; }
    public SamlConfigurationPropertyItemsBoolean IdpHttpRedirect { get; set; }
    public SamlConfigurationPropertyItemsString ServiceProviderEntityId { get; set; }
    public SamlConfigurationPropertyItemsString AssertionConsumerServiceURL { get; set; }
    public SamlConfigurationPropertyItemsString SpPrivateKeyAlias { get; set; }
    public SamlConfigurationPropertyItemsString KeyStorePassword { get; set; }
    public SamlConfigurationPropertyItemsString DefaultRedirectUrl { get; set; }
    public SamlConfigurationPropertyItemsString UserIDAttribute { get; set; }
    public SamlConfigurationPropertyItemsBoolean UseEncryption { get; set; }
    public SamlConfigurationPropertyItemsBoolean CreateUser { get; set; }
    public SamlConfigurationPropertyItemsBoolean AddGroupMemberships { get; set; }
    public SamlConfigurationPropertyItemsString GroupMembershipAttribute { get; set; }
    public SamlConfigurationPropertyItemsArray DefaultGroups { get; set; }
    public SamlConfigurationPropertyItemsString NameIdFormat { get; set; }
    public SamlConfigurationPropertyItemsArray SynchronizeAttributes { get; set; }
    public SamlConfigurationPropertyItemsBoolean HandleLogout { get; set; }
    public SamlConfigurationPropertyItemsString LogoutUrl { get; set; }
    public SamlConfigurationPropertyItemsLong ClockTolerance { get; set; }
    public SamlConfigurationPropertyItemsString DigestMethod { get; set; }
    public SamlConfigurationPropertyItemsString SignatureMethod { get; set; }
    public SamlConfigurationPropertyItemsString UserIntermediatePath { get; set; }
}


