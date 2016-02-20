/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.template;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

public interface Transformer<S,R> {

    //----------------------------------------------------------
    /**
     * Handy method to transform source to result.
     * @param p_candidate - Candidate to be transform
     * @return
     */
    public R transform(S p_candidate);

    //----------------------------------------------------------
    /**
     * Handy method to transform multiple source
     * @param p_candidates  - Candidates to be transform
     * @return
     */
    default Collection<R> transform(Collection<S> p_candidates) {
        return p_candidates.
                stream().
                filter(x -> x != null).
                map(x -> transform(x)).
                collect(Collectors.toList());
    }

    //-----------------------------------------------------------
}
