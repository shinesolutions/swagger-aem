using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// BundleInfo
    /// </summary>
    public sealed class BundleInfo:  IEquatable<BundleInfo>
    { 
        /// <summary>
        /// Status description of all bundles
        /// </summary>
        public string Status { get; private set; }

        /// <summary>
        /// S
        /// </summary>
        public List<int?> S { get; private set; }

        /// <summary>
        /// Data
        /// </summary>
        public List<BundleData> Data { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BundleInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BundleInfo()
        {
        }

        private BundleInfo(string Status, List<int?> S, List<BundleData> Data)
        {
            
            this.Status = Status;
            
            this.S = S;
            
            this.Data = Data;
            
        }

        /// <summary>
        /// Returns builder of BundleInfo.
        /// </summary>
        /// <returns>BundleInfoBuilder</returns>
        public static BundleInfoBuilder Builder()
        {
            return new BundleInfoBuilder();
        }

        /// <summary>
        /// Returns BundleInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BundleInfoBuilder</returns>
        public BundleInfoBuilder With()
        {
            return Builder()
                .Status(Status)
                .S(S)
                .Data(Data);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(BundleInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BundleInfo.
        /// </summary>
        /// <param name="left">Compared (BundleInfo</param>
        /// <param name="right">Compared (BundleInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BundleInfo left, BundleInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BundleInfo.
        /// </summary>
        /// <param name="left">Compared (BundleInfo</param>
        /// <param name="right">Compared (BundleInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BundleInfo left, BundleInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BundleInfo.
        /// </summary>
        public sealed class BundleInfoBuilder
        {
            private string _Status;
            private List<int?> _S;
            private List<BundleData> _Data;

            internal BundleInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BundleInfo.Status property.
            /// </summary>
            /// <param name="value">Status description of all bundles</param>
            public BundleInfoBuilder Status(string value)
            {
                _Status = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleInfo.S property.
            /// </summary>
            /// <param name="value">S</param>
            public BundleInfoBuilder S(List<int?> value)
            {
                _S = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleInfo.Data property.
            /// </summary>
            /// <param name="value">Data</param>
            public BundleInfoBuilder Data(List<BundleData> value)
            {
                _Data = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BundleInfo.
            /// </summary>
            /// <returns>BundleInfo</returns>
            public BundleInfo Build()
            {
                Validate();
                return new BundleInfo(
                    Status: _Status,
                    S: _S,
                    Data: _Data
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
