/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.test.sql.parser.internal.asserts.statement.dal.impl;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.sql.parser.sql.dialect.statement.mysql.dal.MySQLShowReplicaStatusStatement;
import org.apache.shardingsphere.test.sql.parser.internal.asserts.SQLCaseAssertContext;
import org.apache.shardingsphere.test.sql.parser.internal.jaxb.domain.statement.dal.ShowReplicaStatusStatementTestCase;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Show replica status statement assert.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ShowReplicaStatusStatementAssert {
    
    /**
     * Assert show replica status statement is correct with expected show replica status statement test case.
     *
     * @param assertContext assert context
     * @param actual actual show replica status statement
     * @param expected expected show replica status statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final MySQLShowReplicaStatusStatement actual, final ShowReplicaStatusStatementTestCase expected) {
        if (null != expected.getChannel()) {
            assertThat(assertContext.getText("Actual show replica status channel name assertion error: "), actual.getChannel(), is(expected.getChannel()));
        }
    }
}
