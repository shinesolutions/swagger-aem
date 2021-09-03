using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// SamlConfigurationInfo
    /// </summary>
    public sealed class SamlConfigurationInfo:  IEquatable<SamlConfigurationInfo>
    { 
        /// <summary>
        /// Persistent Identity (PID)
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// needed for configuration binding
        /// </summary>
        public string BundleLocation { get; private set; }

        /// <summary>
        /// needed for configuraiton binding
        /// </summary>
        public string ServiceLocation { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public SamlConfigurationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SamlConfigurationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SamlConfigurationInfo()
        {
        }

        private SamlConfigurationInfo(string Pid, string Title, string Description, string BundleLocation, string ServiceLocation, SamlConfigurationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of SamlConfigurationInfo.
        /// </summary>
        /// <returns>SamlConfigurationInfoBuilder</returns>
        public static SamlConfigurationInfoBuilder Builder()
        {
            return new SamlConfigurationInfoBuilder();
        }

        /// <summary>
        /// Returns SamlConfigurationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SamlConfigurationInfoBuilder</returns>
        public SamlConfigurationInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .BundleLocation(BundleLocation)
                .ServiceLocation(ServiceLocation)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SamlConfigurationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SamlConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationInfo</param>
        /// <param name="right">Compared (SamlConfigurationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SamlConfigurationInfo left, SamlConfigurationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SamlConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationInfo</param>
        /// <param name="right">Compared (SamlConfigurationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SamlConfigurationInfo left, SamlConfigurationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SamlConfigurationInfo.
        /// </summary>
        public sealed class SamlConfigurationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private string _BundleLocation;
            private string _ServiceLocation;
            private SamlConfigurationProperties _Properties;

            internal SamlConfigurationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SamlConfigurationInfo.Pid property.
            /// </summary>
            /// <param name="value">Persistent Identity (PID)</param>
            public SamlConfigurationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public SamlConfigurationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationInfo.Description property.
            /// </summary>
            /// <param name="value">Title</param>
            public SamlConfigurationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">needed for configuration binding</param>
            public SamlConfigurationInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">needed for configuraiton binding</param>
            public SamlConfigurationInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public SamlConfigurationInfoBuilder Properties(SamlConfigurationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SamlConfigurationInfo.
            /// </summary>
            /// <returns>SamlConfigurationInfo</returns>
            public SamlConfigurationInfo Build()
            {
                Validate();
                return new SamlConfigurationInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    BundleLocation: _BundleLocation,
                    ServiceLocation: _ServiceLocation,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
