/*
 * $Id$
 * Copyright (C) 2001 The Apache Software Foundation. All rights reserved.
 * For details on use and redistribution please refer to the
 * LICENSE file included with these sources.
 */

package org.apache.fop.layoutmgr;


import org.apache.fop.area.Area;

/**
 * The interface for all BreakPoss LayoutManagers.
 */
public interface BPLayoutManager extends LayoutManager {

    /**
     * Return true if the next area which would be generated by this
     * LayoutManager could start a new line (or flow for block-level FO).
     */
    public boolean canBreakBefore(LayoutContext lc);

    /**
     * Generate and return the next break possibility.
     * @param context The layout context contains information about pending
     * space specifiers from ancestor areas or previous areas, reference
     * area inline-progression-dimension and various other layout-related
     * information.
     * @param prevBreakPosition If not null, gives a Position returned by
     * this layout manager on a previous call to getNextBreakPoss. It may not
     * be the previous one returned. The Layout Manager should return the next
     * potential Break Possibility after prevBreakPosition.
     * If prevBreakPosition is null, it should return the first possible
     * BreakPoss.
     */
    public BreakPoss getNextBreakPoss(LayoutContext context,
				      BreakPoss.Position prevBreakPosition);

    public BreakPoss getNextBreakPoss(LayoutContext context);

    /** CURRENTLY NOT USED
    public BreakPoss getStartBreakPoss(LayoutContext lc,
				       BreakPoss.Position bpPrevEnd);
    **/

    /**
     * Return a value indicating whether this LayoutManager has laid out
     * all its content (or generated BreakPossibilities for all content.)
     */
    public boolean isFinished() ;

    /**
     * Set a flag indicating whether the LayoutManager has laid out all
     * its content. This is generally called by the LM itself, but can
     * be called by a parentLM when backtracking.
     */
    public void setFinished(boolean isFinished) ;

    /**
     * Tell the layout manager to add all the child areas implied
     * by BreakPoss.Position objectw which will be returned by the
     * Iterator.
     */
    public void addAreas(PositionIterator posIter) ;

}
