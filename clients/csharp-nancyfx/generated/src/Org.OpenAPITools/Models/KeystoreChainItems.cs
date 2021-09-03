using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// KeystoreChainItems
    /// </summary>
    public sealed class KeystoreChainItems:  IEquatable<KeystoreChainItems>
    { 
        /// <summary>
        /// e.g. \&quot;CN&#x3D;localhost\&quot;
        /// </summary>
        public string Subject { get; private set; }

        /// <summary>
        /// e.g. \&quot;CN&#x3D;Admin\&quot;
        /// </summary>
        public string Issuer { get; private set; }

        /// <summary>
        /// e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
        /// </summary>
        public string NotBefore { get; private set; }

        /// <summary>
        /// e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
        /// </summary>
        public string NotAfter { get; private set; }

        /// <summary>
        /// 18165099476682912368
        /// </summary>
        public int? SerialNumber { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use KeystoreChainItems.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public KeystoreChainItems()
        {
        }

        private KeystoreChainItems(string Subject, string Issuer, string NotBefore, string NotAfter, int? SerialNumber)
        {
            
            this.Subject = Subject;
            
            this.Issuer = Issuer;
            
            this.NotBefore = NotBefore;
            
            this.NotAfter = NotAfter;
            
            this.SerialNumber = SerialNumber;
            
        }

        /// <summary>
        /// Returns builder of KeystoreChainItems.
        /// </summary>
        /// <returns>KeystoreChainItemsBuilder</returns>
        public static KeystoreChainItemsBuilder Builder()
        {
            return new KeystoreChainItemsBuilder();
        }

        /// <summary>
        /// Returns KeystoreChainItemsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>KeystoreChainItemsBuilder</returns>
        public KeystoreChainItemsBuilder With()
        {
            return Builder()
                .Subject(Subject)
                .Issuer(Issuer)
                .NotBefore(NotBefore)
                .NotAfter(NotAfter)
                .SerialNumber(SerialNumber);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(KeystoreChainItems other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (KeystoreChainItems.
        /// </summary>
        /// <param name="left">Compared (KeystoreChainItems</param>
        /// <param name="right">Compared (KeystoreChainItems</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (KeystoreChainItems left, KeystoreChainItems right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (KeystoreChainItems.
        /// </summary>
        /// <param name="left">Compared (KeystoreChainItems</param>
        /// <param name="right">Compared (KeystoreChainItems</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (KeystoreChainItems left, KeystoreChainItems right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of KeystoreChainItems.
        /// </summary>
        public sealed class KeystoreChainItemsBuilder
        {
            private string _Subject;
            private string _Issuer;
            private string _NotBefore;
            private string _NotAfter;
            private int? _SerialNumber;

            internal KeystoreChainItemsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for KeystoreChainItems.Subject property.
            /// </summary>
            /// <param name="value">e.g. \&quot;CN&#x3D;localhost\&quot;</param>
            public KeystoreChainItemsBuilder Subject(string value)
            {
                _Subject = value;
                return this;
            }

            /// <summary>
            /// Sets value for KeystoreChainItems.Issuer property.
            /// </summary>
            /// <param name="value">e.g. \&quot;CN&#x3D;Admin\&quot;</param>
            public KeystoreChainItemsBuilder Issuer(string value)
            {
                _Issuer = value;
                return this;
            }

            /// <summary>
            /// Sets value for KeystoreChainItems.NotBefore property.
            /// </summary>
            /// <param name="value">e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;</param>
            public KeystoreChainItemsBuilder NotBefore(string value)
            {
                _NotBefore = value;
                return this;
            }

            /// <summary>
            /// Sets value for KeystoreChainItems.NotAfter property.
            /// </summary>
            /// <param name="value">e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;</param>
            public KeystoreChainItemsBuilder NotAfter(string value)
            {
                _NotAfter = value;
                return this;
            }

            /// <summary>
            /// Sets value for KeystoreChainItems.SerialNumber property.
            /// </summary>
            /// <param name="value">18165099476682912368</param>
            public KeystoreChainItemsBuilder SerialNumber(int? value)
            {
                _SerialNumber = value;
                return this;
            }


            /// <summary>
            /// Builds instance of KeystoreChainItems.
            /// </summary>
            /// <returns>KeystoreChainItems</returns>
            public KeystoreChainItems Build()
            {
                Validate();
                return new KeystoreChainItems(
                    Subject: _Subject,
                    Issuer: _Issuer,
                    NotBefore: _NotBefore,
                    NotAfter: _NotAfter,
                    SerialNumber: _SerialNumber
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
