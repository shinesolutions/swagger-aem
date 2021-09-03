using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// SamlConfigurationPropertyItemsArray
    /// </summary>
    public sealed class SamlConfigurationPropertyItemsArray:  IEquatable<SamlConfigurationPropertyItemsArray>
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
        public List<string> Values { get; private set; }

        /// <summary>
        /// Property description
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SamlConfigurationPropertyItemsArray.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SamlConfigurationPropertyItemsArray()
        {
        }

        private SamlConfigurationPropertyItemsArray(string Name, bool? Optional, bool? IsSet, int? Type, List<string> Values, string Description)
        {
            
            this.Name = Name;
            
            this.Optional = Optional;
            
            this.IsSet = IsSet;
            
            this.Type = Type;
            
            this.Values = Values;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of SamlConfigurationPropertyItemsArray.
        /// </summary>
        /// <returns>SamlConfigurationPropertyItemsArrayBuilder</returns>
        public static SamlConfigurationPropertyItemsArrayBuilder Builder()
        {
            return new SamlConfigurationPropertyItemsArrayBuilder();
        }

        /// <summary>
        /// Returns SamlConfigurationPropertyItemsArrayBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SamlConfigurationPropertyItemsArrayBuilder</returns>
        public SamlConfigurationPropertyItemsArrayBuilder With()
        {
            return Builder()
                .Name(Name)
                .Optional(Optional)
                .IsSet(IsSet)
                .Type(Type)
                .Values(Values)
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

        public bool Equals(SamlConfigurationPropertyItemsArray other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SamlConfigurationPropertyItemsArray.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationPropertyItemsArray</param>
        /// <param name="right">Compared (SamlConfigurationPropertyItemsArray</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SamlConfigurationPropertyItemsArray left, SamlConfigurationPropertyItemsArray right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SamlConfigurationPropertyItemsArray.
        /// </summary>
        /// <param name="left">Compared (SamlConfigurationPropertyItemsArray</param>
        /// <param name="right">Compared (SamlConfigurationPropertyItemsArray</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SamlConfigurationPropertyItemsArray left, SamlConfigurationPropertyItemsArray right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SamlConfigurationPropertyItemsArray.
        /// </summary>
        public sealed class SamlConfigurationPropertyItemsArrayBuilder
        {
            private string _Name;
            private bool? _Optional;
            private bool? _IsSet;
            private int? _Type;
            private List<string> _Values;
            private string _Description;

            internal SamlConfigurationPropertyItemsArrayBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsArray.Name property.
            /// </summary>
            /// <param name="value">property name</param>
            public SamlConfigurationPropertyItemsArrayBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsArray.Optional property.
            /// </summary>
            /// <param name="value">True if optional</param>
            public SamlConfigurationPropertyItemsArrayBuilder Optional(bool? value)
            {
                _Optional = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsArray.IsSet property.
            /// </summary>
            /// <param name="value">True if property is set</param>
            public SamlConfigurationPropertyItemsArrayBuilder IsSet(bool? value)
            {
                _IsSet = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsArray.Type property.
            /// </summary>
            /// <param name="value">Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password</param>
            public SamlConfigurationPropertyItemsArrayBuilder Type(int? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsArray.Values property.
            /// </summary>
            /// <param name="value">Property value</param>
            public SamlConfigurationPropertyItemsArrayBuilder Values(List<string> value)
            {
                _Values = value;
                return this;
            }

            /// <summary>
            /// Sets value for SamlConfigurationPropertyItemsArray.Description property.
            /// </summary>
            /// <param name="value">Property description</param>
            public SamlConfigurationPropertyItemsArrayBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SamlConfigurationPropertyItemsArray.
            /// </summary>
            /// <returns>SamlConfigurationPropertyItemsArray</returns>
            public SamlConfigurationPropertyItemsArray Build()
            {
                Validate();
                return new SamlConfigurationPropertyItemsArray(
                    Name: _Name,
                    Optional: _Optional,
                    IsSet: _IsSet,
                    Type: _Type,
                    Values: _Values,
                    Description: _Description
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
