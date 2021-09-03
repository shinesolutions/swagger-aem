using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// BundleData
    /// </summary>
    public sealed class BundleData:  IEquatable<BundleData>
    { 
        /// <summary>
        /// Bundle ID
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// Bundle name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Is bundle a fragment
        /// </summary>
        public bool? Fragment { get; private set; }

        /// <summary>
        /// Numeric raw bundle state value
        /// </summary>
        public int? StateRaw { get; private set; }

        /// <summary>
        /// Bundle state value
        /// </summary>
        public string State { get; private set; }

        /// <summary>
        /// Bundle version
        /// </summary>
        public string Version { get; private set; }

        /// <summary>
        /// Bundle symbolic name
        /// </summary>
        public string SymbolicName { get; private set; }

        /// <summary>
        /// Bundle category
        /// </summary>
        public string Category { get; private set; }

        /// <summary>
        /// Props
        /// </summary>
        public List<BundleDataProp> Props { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BundleData.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BundleData()
        {
        }

        private BundleData(int? Id, string Name, bool? Fragment, int? StateRaw, string State, string Version, string SymbolicName, string Category, List<BundleDataProp> Props)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.Fragment = Fragment;
            
            this.StateRaw = StateRaw;
            
            this.State = State;
            
            this.Version = Version;
            
            this.SymbolicName = SymbolicName;
            
            this.Category = Category;
            
            this.Props = Props;
            
        }

        /// <summary>
        /// Returns builder of BundleData.
        /// </summary>
        /// <returns>BundleDataBuilder</returns>
        public static BundleDataBuilder Builder()
        {
            return new BundleDataBuilder();
        }

        /// <summary>
        /// Returns BundleDataBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BundleDataBuilder</returns>
        public BundleDataBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name)
                .Fragment(Fragment)
                .StateRaw(StateRaw)
                .State(State)
                .Version(Version)
                .SymbolicName(SymbolicName)
                .Category(Category)
                .Props(Props);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(BundleData other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BundleData.
        /// </summary>
        /// <param name="left">Compared (BundleData</param>
        /// <param name="right">Compared (BundleData</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BundleData left, BundleData right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BundleData.
        /// </summary>
        /// <param name="left">Compared (BundleData</param>
        /// <param name="right">Compared (BundleData</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BundleData left, BundleData right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BundleData.
        /// </summary>
        public sealed class BundleDataBuilder
        {
            private int? _Id;
            private string _Name;
            private bool? _Fragment;
            private int? _StateRaw;
            private string _State;
            private string _Version;
            private string _SymbolicName;
            private string _Category;
            private List<BundleDataProp> _Props;

            internal BundleDataBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BundleData.Id property.
            /// </summary>
            /// <param name="value">Bundle ID</param>
            public BundleDataBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleData.Name property.
            /// </summary>
            /// <param name="value">Bundle name</param>
            public BundleDataBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleData.Fragment property.
            /// </summary>
            /// <param name="value">Is bundle a fragment</param>
            public BundleDataBuilder Fragment(bool? value)
            {
                _Fragment = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleData.StateRaw property.
            /// </summary>
            /// <param name="value">Numeric raw bundle state value</param>
            public BundleDataBuilder StateRaw(int? value)
            {
                _StateRaw = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleData.State property.
            /// </summary>
            /// <param name="value">Bundle state value</param>
            public BundleDataBuilder State(string value)
            {
                _State = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleData.Version property.
            /// </summary>
            /// <param name="value">Bundle version</param>
            public BundleDataBuilder Version(string value)
            {
                _Version = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleData.SymbolicName property.
            /// </summary>
            /// <param name="value">Bundle symbolic name</param>
            public BundleDataBuilder SymbolicName(string value)
            {
                _SymbolicName = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleData.Category property.
            /// </summary>
            /// <param name="value">Bundle category</param>
            public BundleDataBuilder Category(string value)
            {
                _Category = value;
                return this;
            }

            /// <summary>
            /// Sets value for BundleData.Props property.
            /// </summary>
            /// <param name="value">Props</param>
            public BundleDataBuilder Props(List<BundleDataProp> value)
            {
                _Props = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BundleData.
            /// </summary>
            /// <returns>BundleData</returns>
            public BundleData Build()
            {
                Validate();
                return new BundleData(
                    Id: _Id,
                    Name: _Name,
                    Fragment: _Fragment,
                    StateRaw: _StateRaw,
                    State: _State,
                    Version: _Version,
                    SymbolicName: _SymbolicName,
                    Category: _Category,
                    Props: _Props
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
