using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// TruststoreInfo
    /// </summary>
    public sealed class TruststoreInfo:  IEquatable<TruststoreInfo>
    { 
        /// <summary>
        /// Aliases
        /// </summary>
        public List<TruststoreItems> Aliases { get; private set; }

        /// <summary>
        /// False if truststore don&#39;t exist
        /// </summary>
        public bool? Exists { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TruststoreInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TruststoreInfo()
        {
        }

        private TruststoreInfo(List<TruststoreItems> Aliases, bool? Exists)
        {
            
            this.Aliases = Aliases;
            
            this.Exists = Exists;
            
        }

        /// <summary>
        /// Returns builder of TruststoreInfo.
        /// </summary>
        /// <returns>TruststoreInfoBuilder</returns>
        public static TruststoreInfoBuilder Builder()
        {
            return new TruststoreInfoBuilder();
        }

        /// <summary>
        /// Returns TruststoreInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TruststoreInfoBuilder</returns>
        public TruststoreInfoBuilder With()
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

        public bool Equals(TruststoreInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TruststoreInfo.
        /// </summary>
        /// <param name="left">Compared (TruststoreInfo</param>
        /// <param name="right">Compared (TruststoreInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TruststoreInfo left, TruststoreInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TruststoreInfo.
        /// </summary>
        /// <param name="left">Compared (TruststoreInfo</param>
        /// <param name="right">Compared (TruststoreInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TruststoreInfo left, TruststoreInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TruststoreInfo.
        /// </summary>
        public sealed class TruststoreInfoBuilder
        {
            private List<TruststoreItems> _Aliases;
            private bool? _Exists;

            internal TruststoreInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TruststoreInfo.Aliases property.
            /// </summary>
            /// <param name="value">Aliases</param>
            public TruststoreInfoBuilder Aliases(List<TruststoreItems> value)
            {
                _Aliases = value;
                return this;
            }

            /// <summary>
            /// Sets value for TruststoreInfo.Exists property.
            /// </summary>
            /// <param name="value">False if truststore don&#39;t exist</param>
            public TruststoreInfoBuilder Exists(bool? value)
            {
                _Exists = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TruststoreInfo.
            /// </summary>
            /// <returns>TruststoreInfo</returns>
            public TruststoreInfo Build()
            {
                Validate();
                return new TruststoreInfo(
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