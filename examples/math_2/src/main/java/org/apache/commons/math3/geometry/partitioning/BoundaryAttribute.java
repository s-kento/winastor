/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.math3.geometry.partitioning;

import org.apache.commons.math3.geometry.Space;

/** Class holding boundary attributes.
 * <p>This class is used for the attributes associated with the
 * nodes of region boundary shell trees returned by the {@link
 * Region#getTree Region.getTree}. It contains the
 * parts of the node cut sub-hyperplane that belong to the
 * boundary.</p>
 * <p>This class is a simple placeholder, it does not provide any
 * processing methods.</p>
 * @param <S> Type of the space.
 * @see Region#getTree
 * @version $Id$
 * @since 3.0
 */
public class BoundaryAttribute<S extends Space> {

    /** Part of the node cut sub-hyperplane that belongs to the
     * boundary and has the outside of the region on the plus side of
     * its underlying hyperplane (may be null).
     */
    private final SubHyperplane<S> plusOutside;

    /** Part of the node cut sub-hyperplane that belongs to the
     * boundary and has the inside of the region on the plus side of
     * its underlying hyperplane (may be null).
     */
    private final SubHyperplane<S> plusInside;

    /** Simple constructor.
     * @param plusOutside part of the node cut sub-hyperplane that
     * belongs to the boundary and has the outside of the region on
     * the plus side of its underlying hyperplane (may be null)
     * @param plusInside part of the node cut sub-hyperplane that
     * belongs to the boundary and has the inside of the region on the
     * plus side of its underlying hyperplane (may be null)
     */
    public BoundaryAttribute(final SubHyperplane<S> plusOutside,
                             final SubHyperplane<S> plusInside) {
        this.plusOutside = plusOutside;
        this.plusInside  = plusInside;
    }

    /** Get the part of the node cut sub-hyperplane that belongs to the
     * boundary and has the outside of the region on the plus side of
     * its underlying hyperplane.
     * @return part of the node cut sub-hyperplane that belongs to the
     * boundary and has the outside of the region on the plus side of
     * its underlying hyperplane
     */
    public SubHyperplane<S> getPlusOutside() {
        return plusOutside;
    }

    /** Get the part of the node cut sub-hyperplane that belongs to the
     * boundary and has the inside of the region on the plus side of
     * its underlying hyperplane.
     * @return part of the node cut sub-hyperplane that belongs to the
     * boundary and has the inside of the region on the plus side of
     * its underlying hyperplane
     */
    public SubHyperplane<S> getPlusInside() {
        return plusInside;
    }

}
