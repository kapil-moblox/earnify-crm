/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.template;

import com.crm.earnify.exceptions.TransformerBasedException;

import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;
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
    public R transform(S p_candidate) throws TransformerBasedException;

    //----------------------------------------------------------
    /**
     * Handy method to transform multiple source
     * @param p_candidates  - Candidates to be transform
     * @return
     */
    default Collection<R> transform(Collection<S> p_candidates)
            throws TransformerBasedException{
        return p_candidates.
                stream().
                filter(x -> x != null).
                map(x -> transform(x)).
                collect(Collectors.toList());
    }

    //-----------------------------------------------------------------------------

    /**
     *
     * @param p_candidate
     * @param p_helper_params
     * @return
     * @throws TransformerBasedException
     */
    default R transform(S p_candidate,Map<String, String> p_helper_params)
            throws TransformerBasedException {
        return transform(p_candidate);
    }

    //-------------------------------------------------------------------------------

    /**
     *
     * @param p_supplier
     * @return
     */
    default R transform(Supplier<S> p_supplier) {
        S l_candidate = p_supplier.get();
        return transform(l_candidate);
    }

}
