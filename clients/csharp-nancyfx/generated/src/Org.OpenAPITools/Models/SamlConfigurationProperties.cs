using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// SamlConfigurationProperties
    /// </summary>
    public sealed class SamlConfigurationProperties:  IEquatable<SamlConfigurationProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public SamlConfigurationPropertyItemsArray Path { get; private set; }

        /// <summary>
        /// ServiceRanking
        /// </summary>
        public SamlConfigurationPropertyItemsLong ServiceRanking { get; private set; }

        /// <summary>
        /// IdpUrl
        /// </summary>
        public SamlConfigurationPropertyItemsString IdpUrl { get; private set; }

        /// <summary>
        /// IdpCertAlias
        /// </summary>
        public SamlConfigurationPropertyItemsString IdpCertAlias { get; private set; }

        /// <summary>
        /// IdpHttpRedirect
        /// </summary>
        public SamlConfigurationPropertyItemsBoolean IdpHttpRedirect { get; private set; }

        /// <summary>
        /// ServiceProviderEntityId
        /// </summary>
        public SamlConfigurationPropertyItemsString ServiceProviderEntityId { get; private set; }

        /// <summary>
        /// AssertionConsumerServiceURL
        /// </summary>
        public SamlConfigurationPropertyItemsString AssertionConsumerServiceURL { get; private set; }

        /// <summary>
        /// SpPrivateKeyAlias
        /// </summary>
        public SamlConfigurationPropertyItemsString SpPrivateKeyAlias { get; private set; }

        /// <summary>
        /// KeyStorePassword
        /// </summary>
        public SamlConfigurationPropertyItemsString KeyStorePassword { get; private set; }

        /// <summary>
        /// DefaultRedirectUrl
        /// </summary>
        public SamlConfigurationPropertyItemsString DefaultRedirectUrl { get; private set; }

        /// <summary>
        /// UserIDAttribute
        /// </summary>
        public SamlConfigurationPropertyItemsString UserIDAttribute { get; private set; }

        /// <summary>
        /// UseEncryption
        /// </summary>
        public SamlConfigurationPropertyItemsBoolean UseEncryption { get; private set; }

        /// <summary>
        /// CreateUser
        /// </summary>
        public SamlConfigurationPropertyItemsBoolean CreateUser { get; private set; }

        /// <summary>
        /// AddGroupMemberships
        /// </summary>
        public SamlConfigurationPropertyItemsBoolean AddGroupMemberships { get; private set; }

        /// <summary>
        /// GroupMembershipAttribute
        /// </summary>
        public SamlConfigurationPropertyItemsString GroupMembershipAttribute { get; private set; }

        /// <summary>
        /// DefaultGroups
        /// </summary>
        public SamlConfigurationPropertyItemsArray DefaultGroups { get; private set; }

        /// <summary>
        /// NameIdFormat
        /// </summary>
        public SamlConfigurationPropertyItemsString NameIdFormat { get; private set; }

        /// <summary>
        /// SynchronizeAttributes
        /// </summary>
        public SamlConfigurationPropertyItemsArray SynchronizeAttributes { get; private set; }

        /// <summary>
        /// HandleLogout
        /// </summary>
        public SamlConfigurationPropertyItemsBoolean HandleLogout { get; private set; }

        /// <summary>
        /// LogoutUrl
        /// </summary>
        public SamlConfigurationPropertyItemsString LogoutUrl { get; private set; }

        /// <summary>
        /// ClockTolerance
        /// </summary>
        public SamlConfigurationPropertyItemsLong ClockTolerance { get; private set; }

        /// <summary>
        /// DigestMethod
        /// </summary>
        public SamlConfigurationPropertyItemsString DigestMethod { get; private set; }

        /// <summary>
        /// SignatureMethod
        /// </summary>
        public SamlConfigurationPropertyItemsString SignatureMethod { get; private set; }

        /// <summary>
        /// UserIntermediatePath
        /// </summary>
        public SamlConfigurationPropertyItemsString UserIntermediatePath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SamlConfigurationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SamlConfigurationProperties()
        {
        }

        private SamlConfigurationProperties(SamlConfigurationPropertyItemsArray Path, SamlConfigurationPropertyItemsLong ServiceRanking, SamlConfigurationPropertyItemsString IdpUrl, SamlConfigurationPropertyItemsString IdpCertAlias, SamlConfigurationPropertyItemsBoolean IdpHttpRedirect, SamlConfigurationPropertyItemsString ServiceProviderEntityId, SamlConfigurationPropertyItemsString AssertionConsumerServiceURL, SamlConfigurationPropertyItemsString SpPrivateKeyAlias, SamlConfigurationPropertyItemsString KeyStorePassword, SamlConfigurationPropertyItemsString DefaultRedirectUrl, SamlConfigurationPropertyItemsString UserIDAttribute, SamlConfigurationPropertyItemsBoolean UseEncryption, SamlConfigurationPropertyItemsBoolean CreateUser, SamlConfigurationPropertyItemsBoolean AddGroupMemberships, SamlConfigurationPropertyItemsString GroupMembershipAttribute, SamlConfigurationPropertyItemsArray DefaultGroups, SamlConfigurationPropertyItemsString NameIdFormat, SamlConfigurationPropertyItemsArray SynchronizeAttributes, SamlConfigurationPropertyItemsBoolean HandleLogout, SamlConfigurationPropertyItemsString LogoutUrl, SamlConfigurationPropertyItemsLong ClockTolerance, SamlConfigurationPropertyItemsString DigestMethod, SamlConfigurationPropertyItemsString SignatureMethod, SamlConfigurationPropertyItemsString UserIntermediatePath)
        {
            
            this.Path = Path;
            
            this.ServiceRanking = ServiceRanking;
            
            this.IdpUrl = IdpUrl;
            
            this.IdpCertAlias = IdpCertAlias;
            
            this.IdpHttpRedirect = IdpHttpRedirect;
            
            this.ServiceProviderEntityId = ServiceProviderEntityId;
            
            this.AssertionConsumerServiceURL = AssertionConsumerServiceURL;
            
            this.SpPrivateKeyAlias = SpPrivateKeyAlias;
            
            this.KeyStorePassword = KeyStorePassword;
            
            this.DefaultRedirectUrl = DefaultRedirectUrl;
            
            this.UserIDAttribute = UserIDAttribute;
            
            this.UseEncryption = UseEncryption;
            
            this.CreateUser = CreateUser;
            
            this.AddGroupMemberships = AddGroupMemberships;
            
            this.GroupMembershipAttribute = GroupMembershipAttribute;
            
            this.DefaultGroups = DefaultGroups;
            
            this.NameIdFormat = NameIdFormat;
            
            this.SynchronizeAttributes = SynchronizeAttributes;
            
            this.HandleLogout = HandleLogout;
            
            this.LogoutUrl = LogoutUrl;
            
            this.ClockTolerance = ClockTolerance;
            
            this.DigestMethod = DigestMethod;
            
            this.SignatureMethod = SignatureMethod;
            
            this.UserIntermediatePath = UserIntermediatePath;
            
        }

        /// <summary>
        /// Returns builder of SamlConfigurationProperties.
        /// </summary>
        /// <returns>SamlConfigurationPropertiesBuilder</returns>
        public static SamlConfigurationPropertiesBuilder Builder()
        {
            return new SamlConfigurationPropertiesBuilder();
        }

        /// <summary>
        /// Returns SamlConfigurationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SamlConfigurationPropertiesBuilder</returns>
        public SamlConfigurationPropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
                .ServiceRanking(ServiceRanking)
                .IdpUrl(IdpUrl)
                .IdpCertAlias(IdpCertAlias)
                .IdpHttpRedirect(IdpHttpRedirect)
                .ServiceProviderEntityId(ServiceProviderEntityId)
                .AssertionConsumerServiceURL(AssertionConsumerServiceURL)
                .SpPrivateKeyAlias(SpPrivateKeyAlias)
                .KeyStorePassword(KeyStorePassword)
                .DefaultRedirectUrl(DefaultRedirectUrl)
                .UserIDAttribute(UserIDAttribute)
                .UseEncryption(UseEncryption)
                .CreateUser(CreateUser)
                .AddGroupMemberships(AddGroupMemberships)
                .GroupMembershipAttribute(GroupMembershipAttribute)
                .DefaultGroups(DefaultGroups)
                .NameIdFormat(NameIdFormat)
                .SynchronizeAttributes(SynchronizeAttributes)
                .HandleLogout(HandleLogout)
                .LogoutUrl(LogoutUrl)
                .ClockTolerance(ClockTolerance)
                .DigestMethod(DigestMethod)
                .SignatureMethod(SignatureMethod)
                .UserIntermediatePath(UserIntermediatePath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SamlConfigurationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SamlConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationProperties</param>
        /// <param name="right">Compared (SamlConfigurationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SamlConfigurationProperties left, SamlConfigurationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SamlConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationProperties</param>
        /// <param name="right">Compared (SamlConfigurationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SamlConfigurationProperties left, SamlConfigurationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SamlConfigurationProperties.
        /// </summary>
        public sealed class SamlConfigurationPropertiesBuilder
        {
            private SamlConfigurationPropertyItemsArray _Path;
            private SamlConfigurationPropertyItemsLong _ServiceRanking;
            private SamlConfigurationPropertyItemsString _IdpUrl;
            private SamlConfigurationPropertyItemsString _IdpCertAlias;
            private SamlConfigurationPropertyItemsBoolean _IdpHttpRedirect;
            private SamlConfigurationPropertyItemsString _ServiceProviderEntityId;
            private SamlConfigurationPropertyItemsString _AssertionConsumerServiceURL;
            private SamlConfigurationPropertyItemsString _SpPrivateKeyAlias;
            private SamlConfigurationPropertyItemsString _KeyStorePassword;
            private SamlConfigurationPropertyItemsString _DefaultRedirectUrl;
            private SamlConfigurationPropertyItemsString _UserIDAttribute;
            private SamlConfigurationPropertyItemsBoolean _UseEncryption;
            private SamlConfigurationPropertyItemsBoolean _CreateUser;
            private SamlConfigurationPropertyItemsBoolean _AddGroupMemberships;
            private SamlConfigurationPropertyItemsString _GroupMembershipAttribute;
            private SamlConfigurationPropertyItemsArray _DefaultGroups;
            private SamlConfigurationPropertyItemsString _NameIdFormat;
            private SamlConfigurationPropertyItemsArray _SynchronizeAttributes;
            private SamlConfigurationPropertyItemsBoolean _HandleLogout;
            private SamlConfigurationPropertyItemsString _LogoutUrl;
            private SamlConfigurationPropertyItemsLong _ClockTolerance;
            private SamlConfigurationPropertyItemsString _DigestMethod;
            private SamlConfigurationPropertyItemsString _SignatureMethod;
            private SamlConfigurationPropertyItemsString _UserIntermediatePath;

            internal SamlConfigurationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public SamlConfigurationPropertiesBuilder Path(SamlConfigurationPropertyItemsArray value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public SamlConfigurationPropertiesBuilder ServiceRanking(SamlConfigurationPropertyItemsLong value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.IdpUrl property.
            /// </summary>
            /// <param name="value">IdpUrl</param>
            public SamlConfigurationPropertiesBuilder IdpUrl(SamlConfigurationPropertyItemsString value)
            {
                _IdpUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.IdpCertAlias property.
            /// </summary>
            /// <param name="value">IdpCertAlias</param>
            public SamlConfigurationPropertiesBuilder IdpCertAlias(SamlConfigurationPropertyItemsString value)
            {
                _IdpCertAlias = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.IdpHttpRedirect property.
            /// </summary>
            /// <param name="value">IdpHttpRedirect</param>
            public SamlConfigurationPropertiesBuilder IdpHttpRedirect(SamlConfigurationPropertyItemsBoolean value)
            {
                _IdpHttpRedirect = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.ServiceProviderEntityId property.
            /// </summary>
            /// <param name="value">ServiceProviderEntityId</param>
            public SamlConfigurationPropertiesBuilder ServiceProviderEntityId(SamlConfigurationPropertyItemsString value)
            {
                _ServiceProviderEntityId = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.AssertionConsumerServiceURL property.
            /// </summary>
            /// <param name="value">AssertionConsumerServiceURL</param>
            public SamlConfigurationPropertiesBuilder AssertionConsumerServiceURL(SamlConfigurationPropertyItemsString value)
            {
                _AssertionConsumerServiceURL = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.SpPrivateKeyAlias property.
            /// </summary>
            /// <param name="value">SpPrivateKeyAlias</param>
            public SamlConfigurationPropertiesBuilder SpPrivateKeyAlias(SamlConfigurationPropertyItemsString value)
            {
                _SpPrivateKeyAlias = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.KeyStorePassword property.
            /// </summary>
            /// <param name="value">KeyStorePassword</param>
            public SamlConfigurationPropertiesBuilder KeyStorePassword(SamlConfigurationPropertyItemsString value)
            {
                _KeyStorePassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.DefaultRedirectUrl property.
            /// </summary>
            /// <param name="value">DefaultRedirectUrl</param>
            public SamlConfigurationPropertiesBuilder DefaultRedirectUrl(SamlConfigurationPropertyItemsString value)
            {
                _DefaultRedirectUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.UserIDAttribute property.
            /// </summary>
            /// <param name="value">UserIDAttribute</param>
            public SamlConfigurationPropertiesBuilder UserIDAttribute(SamlConfigurationPropertyItemsString value)
            {
                _UserIDAttribute = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.UseEncryption property.
            /// </summary>
            /// <param name="value">UseEncryption</param>
            public SamlConfigurationPropertiesBuilder UseEncryption(SamlConfigurationPropertyItemsBoolean value)
            {
                _UseEncryption = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.CreateUser property.
            /// </summary>
            /// <param name="value">CreateUser</param>
            public SamlConfigurationPropertiesBuilder CreateUser(SamlConfigurationPropertyItemsBoolean value)
            {
                _CreateUser = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.AddGroupMemberships property.
            /// </summary>
            /// <param name="value">AddGroupMemberships</param>
            public SamlConfigurationPropertiesBuilder AddGroupMemberships(SamlConfigurationPropertyItemsBoolean value)
            {
                _AddGroupMemberships = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.GroupMembershipAttribute property.
            /// </summary>
            /// <param name="value">GroupMembershipAttribute</param>
            public SamlConfigurationPropertiesBuilder GroupMembershipAttribute(SamlConfigurationPropertyItemsString value)
            {
                _GroupMembershipAttribute = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.DefaultGroups property.
            /// </summary>
            /// <param name="value">DefaultGroups</param>
            public SamlConfigurationPropertiesBuilder DefaultGroups(SamlConfigurationPropertyItemsArray value)
            {
                _DefaultGroups = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.NameIdFormat property.
            /// </summary>
            /// <param name="value">NameIdFormat</param>
            public SamlConfigurationPropertiesBuilder NameIdFormat(SamlConfigurationPropertyItemsString value)
            {
                _NameIdFormat = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.SynchronizeAttributes property.
            /// </summary>
            /// <param name="value">SynchronizeAttributes</param>
            public SamlConfigurationPropertiesBuilder SynchronizeAttributes(SamlConfigurationPropertyItemsArray value)
            {
                _SynchronizeAttributes = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.HandleLogout property.
            /// </summary>
            /// <param name="value">HandleLogout</param>
            public SamlConfigurationPropertiesBuilder HandleLogout(SamlConfigurationPropertyItemsBoolean value)
            {
                _HandleLogout = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.LogoutUrl property.
            /// </summary>
            /// <param name="value">LogoutUrl</param>
            public SamlConfigurationPropertiesBuilder LogoutUrl(SamlConfigurationPropertyItemsString value)
            {
                _LogoutUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.ClockTolerance property.
            /// </summary>
            /// <param name="value">ClockTolerance</param>
            public SamlConfigurationPropertiesBuilder ClockTolerance(SamlConfigurationPropertyItemsLong value)
            {
                _ClockTolerance = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.DigestMethod property.
            /// </summary>
            /// <param name="value">DigestMethod</param>
            public SamlConfigurationPropertiesBuilder DigestMethod(SamlConfigurationPropertyItemsString value)
            {
                _DigestMethod = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.SignatureMethod property.
            /// </summary>
            /// <param name="value">SignatureMethod</param>
            public SamlConfigurationPropertiesBuilder SignatureMethod(SamlConfigurationPropertyItemsString value)
            {
                _SignatureMethod = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationProperties.UserIntermediatePath property.
            /// </summary>
            /// <param name="value">UserIntermediatePath</param>
            public SamlConfigurationPropertiesBuilder UserIntermediatePath(SamlConfigurationPropertyItemsString value)
            {
                _UserIntermediatePath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SamlConfigurationProperties.
            /// </summary>
            /// <returns>SamlConfigurationProperties</returns>
            public SamlConfigurationProperties Build()
            {
                Validate();
                return new SamlConfigurationProperties(
                    Path: _Path,
                    ServiceRanking: _ServiceRanking,
                    IdpUrl: _IdpUrl,
                    IdpCertAlias: _IdpCertAlias,
                    IdpHttpRedirect: _IdpHttpRedirect,
                    ServiceProviderEntityId: _ServiceProviderEntityId,
                    AssertionConsumerServiceURL: _AssertionConsumerServiceURL,
                    SpPrivateKeyAlias: _SpPrivateKeyAlias,
                    KeyStorePassword: _KeyStorePassword,
                    DefaultRedirectUrl: _DefaultRedirectUrl,
                    UserIDAttribute: _UserIDAttribute,
                    UseEncryption: _UseEncryption,
                    CreateUser: _CreateUser,
                    AddGroupMemberships: _AddGroupMemberships,
                    GroupMembershipAttribute: _GroupMembershipAttribute,
                    DefaultGroups: _DefaultGroups,
                    NameIdFormat: _NameIdFormat,
                    SynchronizeAttributes: _SynchronizeAttributes,
                    HandleLogout: _HandleLogout,
                    LogoutUrl: _LogoutUrl,
                    ClockTolerance: _ClockTolerance,
                    DigestMethod: _DigestMethod,
                    SignatureMethod: _SignatureMethod,
                    UserIntermediatePath: _UserIntermediatePath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
