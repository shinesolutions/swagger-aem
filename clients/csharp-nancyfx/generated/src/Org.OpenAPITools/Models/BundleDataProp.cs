using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// BundleDataProp
    /// </summary>
    public sealed class BundleDataProp:  IEquatable<BundleDataProp>
    { 
        /// <summary>
        /// Bundle data key
        /// </summary>
        public string Key { get; private set; }

        /// <summary>
        /// Bundle data value
        /// </summary>
        public string Value { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BundleDataProp.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BundleDataProp()
        {
        }

        private BundleDataProp(string Key, string Value)
        {
            
            this.Key = Key;
            
            this.Value = Value;
            
        }

        /// <summary>
        /// Returns builder of BundleDataProp.
        /// </summary>
        /// <returns>BundleDataPropBuilder</returns>
        public static BundleDataPropBuilder Builder()
        {
            return new BundleDataPropBuilder();
        }

        /// <summary>
        /// Returns BundleDataPropBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BundleDataPropBuilder</returns>
        public BundleDataPropBuilder With()
        {
            return Builder()
                .Key(Key)
                .Value(Value);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(BundleDataProp other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BundleDataProp.
        /// </summary>
        /// <param name="left">Compared (BundleDataProp</param>
        /// <param name="right">Compared (BundleDataProp</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BundleDataProp left, BundleDataProp right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BundleDataProp.
        /// </summary>
        /// <param name="left">Compared (BundleDataProp</param>
        /// <param name="right">Compared (BundleDataProp</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BundleDataProp left, BundleDataProp right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BundleDataProp.
        /// </summary>
        public sealed class BundleDataPropBuilder
        {
            private string _Key;
            private string _Value;

            internal BundleDataPropBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BundleDataProp.Key property.
            /// </summary>
            /// <param name="value">Bundle data key</param>
            public BundleDataPropBuilder Key(string value)
            {
                _Key = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleDataProp.Value property.
            /// </summary>
            /// <param name="value">Bundle data value</param>
            public BundleDataPropBuilder Value(string value)
            {
                _Value = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BundleDataProp.
            /// </summary>
            /// <returns>BundleDataProp</returns>
            public BundleDataProp Build()
            {
                Validate();
                return new BundleDataProp(
                    Key: _Key,
                    Value: _Value
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
