using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// SamlConfigurationPropertyItemsLong
    /// </summary>
    public sealed class SamlConfigurationPropertyItemsLong:  IEquatable<SamlConfigurationPropertyItemsLong>
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
        public int? Value { get; private set; }

        /// <summary>
        /// Property description
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SamlConfigurationPropertyItemsLong.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SamlConfigurationPropertyItemsLong()
        {
        }

        private SamlConfigurationPropertyItemsLong(string Name, bool? Optional, bool? IsSet, int? Type, int? Value, string Description)
        {
            
            this.Name = Name;
            
            this.Optional = Optional;
            
            this.IsSet = IsSet;
            
            this.Type = Type;
            
            this.Value = Value;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of SamlConfigurationPropertyItemsLong.
        /// </summary>
        /// <returns>SamlConfigurationPropertyItemsLongBuilder</returns>
        public static SamlConfigurationPropertyItemsLongBuilder Builder()
        {
            return new SamlConfigurationPropertyItemsLongBuilder();
        }

        /// <summary>
        /// Returns SamlConfigurationPropertyItemsLongBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SamlConfigurationPropertyItemsLongBuilder</returns>
        public SamlConfigurationPropertyItemsLongBuilder With()
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

        public bool Equals(SamlConfigurationPropertyItemsLong other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SamlConfigurationPropertyItemsLong.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationPropertyItemsLong</param>
        /// <param name="right">Compared (SamlConfigurationPropertyItemsLong</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SamlConfigurationPropertyItemsLong left, SamlConfigurationPropertyItemsLong right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SamlConfigurationPropertyItemsLong.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationPropertyItemsLong</param>
        /// <param name="right">Compared (SamlConfigurationPropertyItemsLong</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SamlConfigurationPropertyItemsLong left, SamlConfigurationPropertyItemsLong right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SamlConfigurationPropertyItemsLong.
        /// </summary>
        public sealed class SamlConfigurationPropertyItemsLongBuilder
        {
            private string _Name;
            private bool? _Optional;
            private bool? _IsSet;
            private int? _Type;
            private int? _Value;
            private string _Description;

            internal SamlConfigurationPropertyItemsLongBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsLong.Name property.
            /// </summary>
            /// <param name="value">property name</param>
            public SamlConfigurationPropertyItemsLongBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsLong.Optional property.
            /// </summary>
            /// <param name="value">True if optional</param>
            public SamlConfigurationPropertyItemsLongBuilder Optional(bool? value)
            {
                _Optional = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsLong.IsSet property.
            /// </summary>
            /// <param name="value">True if property is set</param>
            public SamlConfigurationPropertyItemsLongBuilder IsSet(bool? value)
            {
                _IsSet = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsLong.Type property.
            /// </summary>
            /// <param name="value">Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password</param>
            public SamlConfigurationPropertyItemsLongBuilder Type(int? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsLong.Value property.
            /// </summary>
            /// <param name="value">Property value</param>
            public SamlConfigurationPropertyItemsLongBuilder Value(int? value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsLong.Description property.
            /// </summary>
            /// <param name="value">Property description</param>
            public SamlConfigurationPropertyItemsLongBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SamlConfigurationPropertyItemsLong.
            /// </summary>
            /// <returns>SamlConfigurationPropertyItemsLong</returns>
            public SamlConfigurationPropertyItemsLong Build()
            {
                Validate();
                return new SamlConfigurationPropertyItemsLong(
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