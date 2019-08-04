using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// InstallStatusStatus
    /// </summary>
    public sealed class InstallStatusStatus:  IEquatable<InstallStatusStatus>
    { 
        /// <summary>
        /// Finished
        /// </summary>
        public bool? Finished { get; private set; }

        /// <summary>
        /// ItemCount
        /// </summary>
        public int? ItemCount { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InstallStatusStatus.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InstallStatusStatus()
        {
        }

        private InstallStatusStatus(bool? Finished, int? ItemCount)
        {
            
            this.Finished = Finished;
            
            this.ItemCount = ItemCount;
            
        }

        /// <summary>
        /// Returns builder of InstallStatusStatus.
        /// </summary>
        /// <returns>InstallStatusStatusBuilder</returns>
        public static InstallStatusStatusBuilder Builder()
        {
            return new InstallStatusStatusBuilder();
        }

        /// <summary>
        /// Returns InstallStatusStatusBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InstallStatusStatusBuilder</returns>
        public InstallStatusStatusBuilder With()
        {
            return Builder()
                .Finished(Finished)
                .ItemCount(ItemCount);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InstallStatusStatus other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InstallStatusStatus.
        /// </summary>
        /// <param name="left">Compared (InstallStatusStatus</param>
        /// <param name="right">Compared (InstallStatusStatus</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InstallStatusStatus left, InstallStatusStatus right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InstallStatusStatus.
        /// </summary>
        /// <param name="left">Compared (InstallStatusStatus</param>
        /// <param name="right">Compared (InstallStatusStatus</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InstallStatusStatus left, InstallStatusStatus right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InstallStatusStatus.
        /// </summary>
        public sealed class InstallStatusStatusBuilder
        {
            private bool? _Finished;
            private int? _ItemCount;

            internal InstallStatusStatusBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InstallStatusStatus.Finished property.
            /// </summary>
            /// <param name="value">Finished</param>
            public InstallStatusStatusBuilder Finished(bool? value)
            {
                _Finished = value;
                return this;
            }

            /// <summary>
            /// Sets value for InstallStatusStatus.ItemCount property.
            /// </summary>
            /// <param name="value">ItemCount</param>
            public InstallStatusStatusBuilder ItemCount(int? value)
            {
                _ItemCount = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InstallStatusStatus.
            /// </summary>
            /// <returns>InstallStatusStatus</returns>
            public InstallStatusStatus Build()
            {
                Validate();
                return new InstallStatusStatus(
                    Finished: _Finished,
                    ItemCount: _ItemCount
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}