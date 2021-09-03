using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// TruststoreItems
    /// </summary>
    public sealed class TruststoreItems:  IEquatable<TruststoreItems>
    { 
        /// <summary>
        /// Truststore alias name
        /// </summary>
        public string Alias { get; private set; }

        /// <summary>
        /// EntryType
        /// </summary>
        public string EntryType { get; private set; }

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
        /// Use TruststoreItems.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TruststoreItems()
        {
        }

        private TruststoreItems(string Alias, string EntryType, string Subject, string Issuer, string NotBefore, string NotAfter, int? SerialNumber)
        {
            
            this.Alias = Alias;
            
            this.EntryType = EntryType;
            
            this.Subject = Subject;
            
            this.Issuer = Issuer;
            
            this.NotBefore = NotBefore;
            
            this.NotAfter = NotAfter;
            
            this.SerialNumber = SerialNumber;
            
        }

        /// <summary>
        /// Returns builder of TruststoreItems.
        /// </summary>
        /// <returns>TruststoreItemsBuilder</returns>
        public static TruststoreItemsBuilder Builder()
        {
            return new TruststoreItemsBuilder();
        }

        /// <summary>
        /// Returns TruststoreItemsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TruststoreItemsBuilder</returns>
        public TruststoreItemsBuilder With()
        {
            return Builder()
                .Alias(Alias)
                .EntryType(EntryType)
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

        public bool Equals(TruststoreItems other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TruststoreItems.
        /// </summary>
        /// <param name="left">Compared (TruststoreItems</param>
        /// <param name="right">Compared (TruststoreItems</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TruststoreItems left, TruststoreItems right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TruststoreItems.
        /// </summary>
        /// <param name="left">Compared (TruststoreItems</param>
        /// <param name="right">Compared (TruststoreItems</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TruststoreItems left, TruststoreItems right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TruststoreItems.
        /// </summary>
        public sealed class TruststoreItemsBuilder
        {
            private string _Alias;
            private string _EntryType;
            private string _Subject;
            private string _Issuer;
            private string _NotBefore;
            private string _NotAfter;
            private int? _SerialNumber;

            internal TruststoreItemsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TruststoreItems.Alias property.
            /// </summary>
            /// <param name="value">Truststore alias name</param>
            public TruststoreItemsBuilder Alias(string value)
            {
                _Alias = value;
                return this;
            }

            /// <summary>
            /// Sets value for TruststoreItems.EntryType property.
            /// </summary>
            /// <param name="value">EntryType</param>
            public TruststoreItemsBuilder EntryType(string value)
            {
                _EntryType = value;
                return this;
            }

            /// <summary>
            /// Sets value for TruststoreItems.Subject property.
            /// </summary>
            /// <param name="value">e.g. \&quot;CN&#x3D;localhost\&quot;</param>
            public TruststoreItemsBuilder Subject(string value)
            {
                _Subject = value;
                return this;
            }

            /// <summary>
            /// Sets value for TruststoreItems.Issuer property.
            /// </summary>
            /// <param name="value">e.g. \&quot;CN&#x3D;Admin\&quot;</param>
            public TruststoreItemsBuilder Issuer(string value)
            {
                _Issuer = value;
                return this;
            }

            /// <summary>
            /// Sets value for TruststoreItems.NotBefore property.
            /// </summary>
            /// <param name="value">e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;</param>
            public TruststoreItemsBuilder NotBefore(string value)
            {
                _NotBefore = value;
                return this;
            }

            /// <summary>
            /// Sets value for TruststoreItems.NotAfter property.
            /// </summary>
            /// <param name="value">e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;</param>
            public TruststoreItemsBuilder NotAfter(string value)
            {
                _NotAfter = value;
                return this;
            }

            /// <summary>
            /// Sets value for TruststoreItems.SerialNumber property.
            /// </summary>
            /// <param name="value">18165099476682912368</param>
            public TruststoreItemsBuilder SerialNumber(int? value)
            {
                _SerialNumber = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TruststoreItems.
            /// </summary>
            /// <returns>TruststoreItems</returns>
            public TruststoreItems Build()
            {
                Validate();
                return new TruststoreItems(
                    Alias: _Alias,
                    EntryType: _EntryType,
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
