using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// KeystoreInfo
    /// </summary>
    public sealed class KeystoreInfo:  IEquatable<KeystoreInfo>
    { 
        /// <summary>
        /// Aliases
        /// </summary>
        public List<KeystoreItems> Aliases { get; private set; }

        /// <summary>
        /// False if truststore don&#39;t exist
        /// </summary>
        public bool? Exists { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use KeystoreInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public KeystoreInfo()
        {
        }

        private KeystoreInfo(List<KeystoreItems> Aliases, bool? Exists)
        {
            
            this.Aliases = Aliases;
            
            this.Exists = Exists;
            
        }

        /// <summary>
        /// Returns builder of KeystoreInfo.
        /// </summary>
        /// <returns>KeystoreInfoBuilder</returns>
        public static KeystoreInfoBuilder Builder()
        {
            return new KeystoreInfoBuilder();
        }

        /// <summary>
        /// Returns KeystoreInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>KeystoreInfoBuilder</returns>
        public KeystoreInfoBuilder With()
        {
            return Builder()
                .Aliases(Aliases)
                .Exists(Exists);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(KeystoreInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (KeystoreInfo.
        /// </summary>
        /// <param name="left">Compared (KeystoreInfo</param>
        /// <param name="right">Compared (KeystoreInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (KeystoreInfo left, KeystoreInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (KeystoreInfo.
        /// </summary>
        /// <param name="left">Compared (KeystoreInfo</param>
        /// <param name="right">Compared (KeystoreInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (KeystoreInfo left, KeystoreInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of KeystoreInfo.
        /// </summary>
        public sealed class KeystoreInfoBuilder
        {
            private List<KeystoreItems> _Aliases;
            private bool? _Exists;

            internal KeystoreInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for KeystoreInfo.Aliases property.
            /// </summary>
            /// <param name="value">Aliases</param>
            public KeystoreInfoBuilder Aliases(List<KeystoreItems> value)
            {
                _Aliases = value;
                return this;
            }

            /// <summary>
            /// Sets value for KeystoreInfo.Exists property.
            /// </summary>
            /// <param name="value">False if truststore don&#39;t exist</param>
            public KeystoreInfoBuilder Exists(bool? value)
            {
                _Exists = value;
                return this;
            }


            /// <summary>
            /// Builds instance of KeystoreInfo.
            /// </summary>
            /// <returns>KeystoreInfo</returns>
            public KeystoreInfo Build()
            {
                Validate();
                return new KeystoreInfo(
                    Aliases: _Aliases,
                    Exists: _Exists
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
