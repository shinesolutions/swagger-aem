using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// SamlConfigurationPropertyItemsString
    /// </summary>
    public sealed class SamlConfigurationPropertyItemsString:  IEquatable<SamlConfigurationPropertyItemsString>
    { 
        /// <summary>
        /// property name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// True if optional
        /// </summary>
        public bool? Optional { get; private set; }

        /// <summary>
        /// True if property is set
        /// </summary>
        public bool? IsSet { get; private set; }

        /// <summary>
        /// Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
        /// </summary>
        public int? Type { get; private set; }

        /// <summary>
        /// Property value
        /// </summary>
        public string Value { get; private set; }

        /// <summary>
        /// Property description
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SamlConfigurationPropertyItemsString.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SamlConfigurationPropertyItemsString()
        {
        }

        private SamlConfigurationPropertyItemsString(string Name, bool? Optional, bool? IsSet, int? Type, string Value, string Description)
        {
            
            this.Name = Name;
            
            this.Optional = Optional;
            
            this.IsSet = IsSet;
            
            this.Type = Type;
            
            this.Value = Value;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of SamlConfigurationPropertyItemsString.
        /// </summary>
        /// <returns>SamlConfigurationPropertyItemsStringBuilder</returns>
        public static SamlConfigurationPropertyItemsStringBuilder Builder()
        {
            return new SamlConfigurationPropertyItemsStringBuilder();
        }

        /// <summary>
        /// Returns SamlConfigurationPropertyItemsStringBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SamlConfigurationPropertyItemsStringBuilder</returns>
        public SamlConfigurationPropertyItemsStringBuilder With()
        {
            return Builder()
                .Name(Name)
                .Optional(Optional)
                .IsSet(IsSet)
                .Type(Type)
                .Value(Value)
                .Description(Description);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SamlConfigurationPropertyItemsString other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SamlConfigurationPropertyItemsString.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationPropertyItemsString</param>
        /// <param name="right">Compared (SamlConfigurationPropertyItemsString</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SamlConfigurationPropertyItemsString left, SamlConfigurationPropertyItemsString right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SamlConfigurationPropertyItemsString.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationPropertyItemsString</param>
        /// <param name="right">Compared (SamlConfigurationPropertyItemsString</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SamlConfigurationPropertyItemsString left, SamlConfigurationPropertyItemsString right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SamlConfigurationPropertyItemsString.
        /// </summary>
        public sealed class SamlConfigurationPropertyItemsStringBuilder
        {
            private string _Name;
            private bool? _Optional;
            private bool? _IsSet;
            private int? _Type;
            private string _Value;
            private string _Description;

            internal SamlConfigurationPropertyItemsStringBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsString.Name property.
            /// </summary>
            /// <param name="value">property name</param>
            public SamlConfigurationPropertyItemsStringBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsString.Optional property.
            /// </summary>
            /// <param name="value">True if optional</param>
            public SamlConfigurationPropertyItemsStringBuilder Optional(bool? value)
            {
                _Optional = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsString.IsSet property.
            /// </summary>
            /// <param name="value">True if property is set</param>
            public SamlConfigurationPropertyItemsStringBuilder IsSet(bool? value)
            {
                _IsSet = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsString.Type property.
            /// </summary>
            /// <param name="value">Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password</param>
            public SamlConfigurationPropertyItemsStringBuilder Type(int? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsString.Value property.
            /// </summary>
            /// <param name="value">Property value</param>
            public SamlConfigurationPropertyItemsStringBuilder Value(string value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsString.Description property.
            /// </summary>
            /// <param name="value">Property description</param>
            public SamlConfigurationPropertyItemsStringBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SamlConfigurationPropertyItemsString.
            /// </summary>
            /// <returns>SamlConfigurationPropertyItemsString</returns>
            public SamlConfigurationPropertyItemsString Build()
            {
                Validate();
                return new SamlConfigurationPropertyItemsString(
                    Name: _Name,
                    Optional: _Optional,
                    IsSet: _IsSet,
                    Type: _Type,
                    Value: _Value,
                    Description: _Description
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
