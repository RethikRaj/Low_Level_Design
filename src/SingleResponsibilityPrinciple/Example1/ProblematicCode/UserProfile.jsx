import React, { useState, useEffect } from 'react';
import axios from 'axios';

// Problem : Too many responsibilities for a single component. Because of that if change the way of handling
// any responsibility, then we need to change this class but this class has no relation to that responsibility

function UserProfile() {
    // 1st responsibility : Handles state
    const [user, setUser] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState('');

    // 2nd responsibility : Handles api calls
    useEffect(() => {
        setLoading(true);
        axios.get('/api/user/123')
            .then(response => setUser(response.data))
            .catch(error => setError('Error fetching user data'))
            .finally(() => setLoading(false));
    }, []);

    // 3rd responsibility : Handles UI , conditional rendering
    if (loading) return <div>Loading...</div>;
    if (error) return <div>{error}</div>;

    return (
        <div>
            <h1>User Profile</h1>
            {user && (
                <div>
                    <p>Name: {user.name}</p>
                    <p>Email: {user.email}</p>
                    {/* More user details */}
                </div>
            )}
            {/* Additional unrelated UI elements */}
        </div>
    );
}