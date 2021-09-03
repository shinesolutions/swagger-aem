using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// InstallStatus
    /// </summary>
    public sealed class InstallStatus:  IEquatable<InstallStatus>
    { 
        /// <summary>
        /// Status
        /// </summary>
        public InstallStatusStatus Status { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InstallStatus.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InstallStatus()
        {
        }

        private InstallStatus(InstallStatusStatus Status)
        {
            
            this.Status = Status;
            
        }

        /// <summary>
        /// Returns builder of InstallStatus.
        /// </summary>
        /// <returns>InstallStatusBuilder</returns>
        public static InstallStatusBuilder Builder()
        {
            return new InstallStatusBuilder();
        }

        /// <summary>
        /// Returns InstallStatusBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InstallStatusBuilder</returns>
        public InstallStatusBuilder With()
        {
            return Builder()
                .Status(Status);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InstallStatus other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InstallStatus.
        /// </summary>
        /// <param name="left">Compared (InstallStatus</param>
        /// <param name="right">Compared (InstallStatus</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InstallStatus left, InstallStatus right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InstallStatus.
        /// </summary>
        /// <param name="left">Compared (InstallStatus</param>
        /// <param name="right">Compared (InstallStatus</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InstallStatus left, InstallStatus right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InstallStatus.
        /// </summary>
        public sealed class InstallStatusBuilder
        {
            private InstallStatusStatus _Status;

            internal InstallStatusBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InstallStatus.Status property.
            /// </summary>
            /// <param name="value">Status</param>
            public InstallStatusBuilder Status(InstallStatusStatus value)
            {
                _Status = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InstallStatus.
            /// </summary>
            /// <returns>InstallStatus</returns>
            public InstallStatus Build()
            {
                Validate();
                return new InstallStatus(
                    Status: _Status
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
