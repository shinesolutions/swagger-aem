using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// SamlConfigurationPropertyItemsBoolean
    /// </summary>
    public sealed class SamlConfigurationPropertyItemsBoolean:  IEquatable<SamlConfigurationPropertyItemsBoolean>
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
        public bool? Value { get; private set; }

        /// <summary>
        /// Property description
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SamlConfigurationPropertyItemsBoolean.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SamlConfigurationPropertyItemsBoolean()
        {
        }

        private SamlConfigurationPropertyItemsBoolean(string Name, bool? Optional, bool? IsSet, int? Type, bool? Value, string Description)
        {
            
            this.Name = Name;
            
            this.Optional = Optional;
            
            this.IsSet = IsSet;
            
            this.Type = Type;
            
            this.Value = Value;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of SamlConfigurationPropertyItemsBoolean.
        /// </summary>
        /// <returns>SamlConfigurationPropertyItemsBooleanBuilder</returns>
        public static SamlConfigurationPropertyItemsBooleanBuilder Builder()
        {
            return new SamlConfigurationPropertyItemsBooleanBuilder();
        }

        /// <summary>
        /// Returns SamlConfigurationPropertyItemsBooleanBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SamlConfigurationPropertyItemsBooleanBuilder</returns>
        public SamlConfigurationPropertyItemsBooleanBuilder With()
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

        public bool Equals(SamlConfigurationPropertyItemsBoolean other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SamlConfigurationPropertyItemsBoolean.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationPropertyItemsBoolean</param>
        /// <param name="right">Compared (SamlConfigurationPropertyItemsBoolean</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SamlConfigurationPropertyItemsBoolean left, SamlConfigurationPropertyItemsBoolean right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SamlConfigurationPropertyItemsBoolean.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationPropertyItemsBoolean</param>
        /// <param name="right">Compared (SamlConfigurationPropertyItemsBoolean</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SamlConfigurationPropertyItemsBoolean left, SamlConfigurationPropertyItemsBoolean right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SamlConfigurationPropertyItemsBoolean.
        /// </summary>
        public sealed class SamlConfigurationPropertyItemsBooleanBuilder
        {
            private string _Name;
            private bool? _Optional;
            private bool? _IsSet;
            private int? _Type;
            private bool? _Value;
            private string _Description;

            internal SamlConfigurationPropertyItemsBooleanBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsBoolean.Name property.
            /// </summary>
            /// <param name="value">property name</param>
            public SamlConfigurationPropertyItemsBooleanBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsBoolean.Optional property.
            /// </summary>
            /// <param name="value">True if optional</param>
            public SamlConfigurationPropertyItemsBooleanBuilder Optional(bool? value)
            {
                _Optional = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsBoolean.IsSet property.
            /// </summary>
            /// <param name="value">True if property is set</param>
            public SamlConfigurationPropertyItemsBooleanBuilder IsSet(bool? value)
            {
                _IsSet = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsBoolean.Type property.
            /// </summary>
            /// <param name="value">Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password</param>
            public SamlConfigurationPropertyItemsBooleanBuilder Type(int? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsBoolean.Value property.
            /// </summary>
            /// <param name="value">Property value</param>
            public SamlConfigurationPropertyItemsBooleanBuilder Value(bool? value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsBoolean.Description property.
            /// </summary>
            /// <param name="value">Property description</param>
            public SamlConfigurationPropertyItemsBooleanBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SamlConfigurationPropertyItemsBoolean.
            /// </summary>
            /// <returns>SamlConfigurationPropertyItemsBoolean</returns>
            public SamlConfigurationPropertyItemsBoolean Build()
            {
                Validate();
                return new SamlConfigurationPropertyItemsBoolean(
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