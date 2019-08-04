using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// KeystoreItems
    /// </summary>
    public sealed class KeystoreItems:  IEquatable<KeystoreItems>
    { 
        /// <summary>
        /// Keystore alias name
        /// </summary>
        public string Alias { get; private set; }

        /// <summary>
        /// e.g. \&quot;privateKey\&quot;
        /// </summary>
        public string EntryType { get; private set; }

        /// <summary>
        /// e.g. \&quot;RSA\&quot;
        /// </summary>
        public string Algorithm { get; private set; }

        /// <summary>
        /// e.g. \&quot;PKCS#8\&quot;
        /// </summary>
        public string Format { get; private set; }

        /// <summary>
        /// Chain
        /// </summary>
        public List<KeystoreChainItems> Chain { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use KeystoreItems.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public KeystoreItems()
        {
        }

        private KeystoreItems(string Alias, string EntryType, string Algorithm, string Format, List<KeystoreChainItems> Chain)
        {
            
            this.Alias = Alias;
            
            this.EntryType = EntryType;
            
            this.Algorithm = Algorithm;
            
            this.Format = Format;
            
            this.Chain = Chain;
            
        }

        /// <summary>
        /// Returns builder of KeystoreItems.
        /// </summary>
        /// <returns>KeystoreItemsBuilder</returns>
        public static KeystoreItemsBuilder Builder()
        {
            return new KeystoreItemsBuilder();
        }

        /// <summary>
        /// Returns KeystoreItemsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>KeystoreItemsBuilder</returns>
        public KeystoreItemsBuilder With()
        {
            return Builder()
                .Alias(Alias)
                .EntryType(EntryType)
                .Algorithm(Algorithm)
                .Format(Format)
                .Chain(Chain);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(KeystoreItems other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (KeystoreItems.
        /// </summary>
        /// <param name="left">Compared (KeystoreItems</param>
        /// <param name="right">Compared (KeystoreItems</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (KeystoreItems left, KeystoreItems right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (KeystoreItems.
        /// </summary>
        /// <param name="left">Compared (KeystoreItems</param>
        /// <param name="right">Compared (KeystoreItems</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (KeystoreItems left, KeystoreItems right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of KeystoreItems.
        /// </summary>
        public sealed class KeystoreItemsBuilder
        {
            private string _Alias;
            private string _EntryType;
            private string _Algorithm;
            private string _Format;
            private List<KeystoreChainItems> _Chain;

            internal KeystoreItemsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for KeystoreItems.Alias property.
            /// </summary>
            /// <param name="value">Keystore alias name</param>
            public KeystoreItemsBuilder Alias(string value)
            {
                _Alias = value;
                return this;
            }

            /// <summary>
            /// Sets value for KeystoreItems.EntryType property.
            /// </summary>
            /// <param name="value">e.g. \&quot;privateKey\&quot;</param>
            public KeystoreItemsBuilder EntryType(string value)
            {
                _EntryType = value;
                return this;
            }

            /// <summary>
            /// Sets value for KeystoreItems.Algorithm property.
            /// </summary>
            /// <param name="value">e.g. \&quot;RSA\&quot;</param>
            public KeystoreItemsBuilder Algorithm(string value)
            {
                _Algorithm = value;
                return this;
            }

            /// <summary>
            /// Sets value for KeystoreItems.Format property.
            /// </summary>
            /// <param name="value">e.g. \&quot;PKCS#8\&quot;</param>
            public KeystoreItemsBuilder Format(string value)
            {
                _Format = value;
                return this;
            }

            /// <summary>
            /// Sets value for KeystoreItems.Chain property.
            /// </summary>
            /// <param name="value">Chain</param>
            public KeystoreItemsBuilder Chain(List<KeystoreChainItems> value)
            {
                _Chain = value;
                return this;
            }


            /// <summary>
            /// Builds instance of KeystoreItems.
            /// </summary>
            /// <returns>KeystoreItems</returns>
            public KeystoreItems Build()
            {
                Validate();
                return new KeystoreItems(
                    Alias: _Alias,
                    EntryType: _EntryType,
                    Algorithm: _Algorithm,
                    Format: _Format,
                    Chain: _Chain
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}