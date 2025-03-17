messages
    message_id,
    conversation_id,
    content,
    sender_id,
    receiver_id,
    status, //'sent', 'delivered', 'read'
    timestamp

conversations
    conversation_id, 
    is_group

conversation_members
    conversation_id,
    user_id