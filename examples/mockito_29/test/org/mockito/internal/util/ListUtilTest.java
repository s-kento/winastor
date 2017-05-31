/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.util;

import static java.util.Arrays.*;
import static org.mockitoutil.ExtraMatchers.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.internal.util.ListUtil.Filter;
import org.mockitoutil.TestBase;

@SuppressWarnings("unchecked")
public class ListUtilTest extends TestBase {

    @Test
    public void shouldFilterList() throws Exception {
        List list = asList("one", "x", "two", "x", "three");
        List filtered = ListUtil.filter(list, new Filter() {
            public boolean isOut(Object object) {
                return object == "x";
            }
        });
        
        assertThat(filtered, hasExactlyInOrder("one", "two", "three"));
    }
    
    @Test
    public void shouldReturnEmptyIfEmptyListGiven() throws Exception {
        List list = new LinkedList();
        List filtered = ListUtil.filter(list, null);
        assertTrue(filtered.isEmpty());
    }
}
